package com.hashengineering.website.blockexplorer;

/**
 * Created by Hash Engineering on 1/21/2016.
 *
 * https://chainz.cryptoid.info/
 */
public class CryptoIDExplorer extends BlockExplorer {

    static String apiKey = "&key=d47da926b82e";
    static String baseUrl = "https://chainz.cryptoid.info/";

    public CryptoIDExplorer(String coin)
    {
        super(baseUrl+coin.toLowerCase()+"/", "block.dws?", "tx.dws?", "address.dws?", "api.dws?q=unspent");
        api = APIType.Cryptoid;
    }

    @Override
    public String getUnspentUrl(String address)
    {
        return url + pathForUnspent + apiKey + "&active="+address;
    }
}
