package com.hashengineering.website.blockexplorer;

import org.bitcoinj.core.CoinDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Eric on 1/21/2016.
 */
public class BlockExplorers {
    Map<String, BlockExplorer> explorers;

    public BlockExplorers()
    {
        explorers = new HashMap<String, BlockExplorer>();
    }

    public BlockExplorer getExplorer(String url)
    {
        return explorers.get(url);
    }

    public void add(String url, String pathForBlock, String pathForTx, String pathForAddress)
    {
        explorers.put(url, new BlockExplorer(url, pathForBlock, pathForTx, pathForAddress));
    }
    public void add(BlockExplorer explorer)
    {
        explorers.put(explorer.getUrl(),explorer);
    }

    public String getUnspentUrl(String url, String address)
    {
        return explorers.get(url).getUnspentUrl(address);
    }

    static public BlockExplorers defaultExplorers;

    static {
        defaultExplorers = new BlockExplorers();
        defaultExplorers.add(new Blockr(CoinDefinition.coinTicker));
        defaultExplorers.add(new CryptoIDExplorer(CoinDefinition.coinTicker));
    }
}
