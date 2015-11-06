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

    /**
     * Translate address into geo code
     *
     * @param address
     * @return error if not found, or geo code
     */
    @Path("/geocode")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGeoCodings(@QueryParam("address") final String address) throws Exception {
        GeoApiContext geoApiContext = new GeoApiContext().setApiKey(ApiKeyConstants.ApiKey.GoogleMapApiKey.getApiKey());
        GeocodingResult[] results = GeocodingApi.geocode(geoApiContext, address).await();
        if (results == null || results.length == 0) {
            return Response.noContent().build();
        }
        return Response.ok().entity(GSON.toJson(results)).build();

    }


    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Hello, fudosan investor!";
    }
}
