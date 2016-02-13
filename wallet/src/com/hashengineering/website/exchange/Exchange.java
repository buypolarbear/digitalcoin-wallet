package com.hashengineering.website.exchange;

import com.hashengineering.website.Website;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Eric on 2/9/2016.
 */
public abstract class Exchange extends Website {
    String pathToTicker;

    public Exchange(String url, String pathToTicker)
    {
        super(url);
        this.pathToTicker = pathToTicker;
    }

    public String getFullUrl() { return getUrl() + pathToTicker; }

    public class ExchangeRate
    {
        double rate;
        boolean success;

        public ExchangeRate(boolean success, double rate)
        {
            this.success = success;
            this.rate = rate;
        }

        public ExchangeRate () { this(false, 0.0); }

        public boolean isSuccessful() { return success; }

        public double getDouble() { return rate; }
    }

    public ExchangeRate getFailedExchangeRate () { return new ExchangeRate(); }

    public abstract ExchangeRate getRate(JSONObject head) throws JSONException;
}
