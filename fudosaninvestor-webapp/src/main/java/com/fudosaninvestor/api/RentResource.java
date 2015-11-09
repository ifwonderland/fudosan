package com.fudosaninvestor.api;

import com.fudosaninvestor.util.ApiKeyConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Rent stats related APIs
 */
@Path("rent")
public class RentResource {


    private static final Gson GSON = new GsonBuilder().create();


}
