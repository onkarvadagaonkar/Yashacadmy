package com.yasha.academy.utilities.serverutilities;

import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by bt18 on 08/10/2016.
 */
public class ResponseBody
{
    public ResponseBody(int responseCode, String responseString) {
        this.responseCode = responseCode;
        this.responseString = responseString;
    }

    int responseCode;

    public int getRequestCode() {
        return requestCode;
    }

    public void setRequestCode(int requestCode) {
        this.requestCode = requestCode;
    }

    int requestCode;
    String responseString;

    public InputStream stream;

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseString() {
        return responseString;
    }

    public void setResponseString(String responseString) {
        this.responseString = responseString;
    }
}
