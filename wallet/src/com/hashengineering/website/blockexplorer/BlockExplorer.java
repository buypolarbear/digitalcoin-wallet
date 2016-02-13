package com.hashengineering.website.blockexplorer;

import com.hashengineering.website.Website;

/**
 * Created by Hash Engineering on 1/21/2016.
 */
public class BlockExplorer extends Website{
    String pathForBlock;
    String pathForTx;
    String pathForAddress;
    String pathForUnspent;

    public enum APIType {
        BitEasy,
        Blockr,
        Abe,
        Cryptoid,
    };

    public APIType api = APIType.Abe;

    public BlockExplorer(String url, String pathForBlock, String pathForTx, String pathForAddress)
    {
        super(url);
        this.pathForAddress = pathForAddress;
        this.pathForTx = pathForTx;
        this.pathForBlock = pathForBlock;
    }

    public BlockExplorer(String url, String pathForBlock, String pathForTx, String pathForAddress, String pathForUnspent)
    {
        super(url);
        this.pathForAddress = pathForAddress;
        this.pathForTx = pathForTx;
        this.pathForBlock = pathForBlock;
        this.pathForUnspent = pathForUnspent;
    }

    public String getBlockUrl()
    {
        return url + pathForBlock;
    }

    public String getTxUrl()
    {
        return url + pathForTx;
    }

    public String getAddressUrl()
    {
        return url + pathForAddress;
    }

    public String getUnspentUrl(String address)
    {
        return url + pathForUnspent + address;
    }

    public String getBlockPath()
    {
        return pathForBlock;
    }

    public String getTxPath()
    {
        return pathForTx;
    }

    public String getAddressPath()
    {
        return pathForAddress;
    }

    public String getUnspentPath(String address)
    {
        return pathForUnspent + address;
    }

}
