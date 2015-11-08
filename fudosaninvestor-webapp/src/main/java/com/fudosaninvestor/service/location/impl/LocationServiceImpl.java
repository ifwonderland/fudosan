package com.fudosaninvestor.service.location.impl;

import com.fudosaninvestor.service.location.*;
import com.fudosaninvestor.util.ApiKeyConstants;
import com.fudosaninvestor.util.LocationUtils;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by Shaochen Huang on 11/8/15.
 */
public class LocationServiceImpl implements LocationService {
    private static final GeoApiContext GEO_API_CONTEXT = new GeoApiContext().setApiKey(ApiKeyConstants.ApiKey.GoogleMapApiKey.getApiKey());

    @Override
    public GeocodingResult getGeocoding(String address, String zipCode) throws InvalidZipcodeException, AmbiguousAddressException, NoMatchingAddressException, GoogleMapServiceException {
        if (StringUtils.isBlank(address) || StringUtils.isBlank(zipCode)) {
            throw new AmbiguousAddressException("Address or zip code entered is empty, invalid search. ");
        }

        if (!LocationUtils.isValidZipCode(zipCode)) {
            throw new InvalidZipcodeException(zipCode);
        }

        GeocodingResult[] results;

        String fullAddress = address + "," + zipCode;

        try {
            results = GeocodingApi.geocode(GEO_API_CONTEXT, fullAddress).await();
        } catch (Exception e) {
            throw new GoogleMapServiceException(e);
        }

        if (results == null || results.length == 0) {
            throw new NoMatchingAddressException(fullAddress);
        }

        if (results.length > 1) {
            throw new AmbiguousAddressException("Multiple address found, narrow down your criteria. full address: " + fullAddress);
        }

        return results[0];
    }
}
