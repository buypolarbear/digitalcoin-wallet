package com.hashengineering.website;

/**
 * Created by Eric on 2/9/2016.
 */
public class Website {
    protected String url;
    protected String name;

    public Website(String url)
    {
        this.url = url;
    }

    public Website(String url, String name)
    {
        this.url = url;
        this.name = name;
    }

    public String getUrl()
    {
        return url;
    }
}
