package com.hashengineering.website.exchange;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by HashEngineering on 2/9/2016.
 *
 * String url = "https://bittrex.com/api/v1.1/public/getticker?market=btc-dgc"
 */
public class Bittrex extends Exchange {
    public Bittrex(String coinTicker)
    {
        super("https://bittrex.com/", "api/v1.1/public/getticker?market=btc-" + coinTicker.toLowerCase());
    }

    public ExchangeRate getRate(JSONObject head) throws JSONException
    {
        /*
				{"success":true,"message":"","result":{"Bid":0.00313794,"Ask":0.00321785,"Last":0.00315893}}
			    }
        */
        String result = head.getString("success");
        if(result.equals("true"))
        {
            JSONObject dataObject = head.getJSONObject("result");

            double averageTrade = dataObject.getDouble("Last");


            return new ExchangeRate(true, averageTrade);
        }
        return new ExchangeRate();
    }
}
