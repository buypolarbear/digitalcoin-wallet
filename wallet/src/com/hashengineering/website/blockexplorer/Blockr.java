package com.hashengineering.website.blockexplorer;

/**
 * Created by HashEngineering on 2/4/2016.
 *
 * Blockr
 *
 * http://dgc.blockr.io/
 */
public class Blockr extends BlockExplorer{
    public Blockr(String coin)
    {
        super("http://"+coin.toLowerCase()+".blockr.io/", "block/info/", "tx/info", "address/info/", "api/v1/address/unspent/");
        api = BlockExplorer.APIType.Blockr;
    }

    @Override
    public String getUnspentUrl(String address)
    {
        return url + pathForUnspent + address;
    }
}
