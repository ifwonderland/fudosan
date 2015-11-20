package com.fudosaninvestor.fudosan.util;

/**
 * Created by Shaochen Huang on 11/5/15.
 */
public class ApiKeyConstants {
    public enum ApiKey{
        GoogleMapApiKey("AIzaSyD2Toeo7bdwmA1XLXi7YQyXfNQfMcy5Ic4"),
        ThreeTapsApiKey("b92c02f4109fb621df4010330642bba0");

        String apiKey;
        ApiKey(String apiKey) {
            this.apiKey = apiKey;
        }

        public String getApiKey() {
            return apiKey;
        }
    }

}
