package com.fudosaninvestor.service.location;

import com.google.maps.model.GeocodingResult;

/**
 * Geo location related services.
 * <p/>
 * Created by Shaochen Huang on 11/8/15.
 */
public interface LocationService {

    /**
     * Use Google Geocoding API to translate address with zipcode to geo location. Only one address is to be matched, if not, various exceptions will be thrown
     *
     * @param address
     * @return null or GeocodingResult
     * @throws InvalidZipcodeException   for invalid zip code
     * @throws AmbiguousAddressException for multiple matching address
     */
    GeocodingResult getGeocoding(String address, String zipCode) throws InvalidZipcodeException, AmbiguousAddressException, GoogleMapServiceException, NoMatchingAddressException;


}
