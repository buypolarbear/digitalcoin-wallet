package com.hashengineering.website.exchange;

import com.hashengineering.website.blockexplorer.BlockExplorer;
import com.hashengineering.website.blockexplorer.Blockr;
import com.hashengineering.website.blockexplorer.CryptoIDExplorer;

import org.bitcoinj.core.CoinDefinition;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Eric on 1/21/2016.
 */
public class ExchangeList implements Iterable<Exchange> {
    Map<String, Exchange> exchanges;

    public ExchangeList()
    {
        exchanges = new HashMap<String, Exchange>();
    }

    public Exchange getExchange(String url)
    {
        return exchanges.get(url);
    }

    public void add(Exchange exchange)
    {
        exchanges.put(exchange.getUrl(), exchange);
    }

    public String getFullUrl(String url)
    {
        return exchanges.get(url).getFullUrl();
    }

    static public ExchangeList defaultExchanges;

    static {
        defaultExchanges = new ExchangeList();
        defaultExchanges.add(new Bittrex(CoinDefinition.coinTicker));
        //defaultExchanges.add();
    }

    public Iterator<Exchange> iterator()
    {
        return exchanges.values().iterator();
    }
}
