package com.fudosaninvestor.service.location;

import com.fudosaninvestor.service.location.impl.LocationServiceImpl;
import com.google.maps.model.GeocodingResult;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Shaochen Huang on 11/8/15.
 */
public class LocationServiceImplTest {

    private LocationService locationService;


    @Before
    public void setup() {
        locationService = new LocationServiceImpl();
    }


    @Test
    public void testGetGeocoding() {
        //test empy address case
        try {
            locationService.getGeocoding("", "");
            Assert.fail();
        } catch (Exception e) {
            Assert.assertTrue(e instanceof AmbiguousAddressException);
        }

//invalid zip code
        try {
            locationService.getGeocoding("adsfa", "d89c");
            Assert.fail();
        } catch (Exception e) {
            Assert.assertTrue(e instanceof InvalidZipcodeException);
        }

        try {
            locationService.getGeocoding("88 dsafjasdfka adfa", "98777");
        } catch (Exception e) {
            Assert.assertTrue(e instanceof NoMatchingAddressException);
        }

        try {
            GeocodingResult result = locationService.getGeocoding("88 bush st", "95126");
            Assert.assertNotNull(result);
            System.out.println(result.formattedAddress);
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

    }


}
