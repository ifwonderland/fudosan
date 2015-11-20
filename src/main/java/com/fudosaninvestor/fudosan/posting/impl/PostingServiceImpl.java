package com.fudosaninvestor.fudosan.posting.impl;

import com.fudosaninvestor.fudosan.posting.PostingService;
import com.fudosaninvestor.fudosan.posting.model.DistanceUnit;
import com.google.maps.model.LatLng;
import java.net.URI;
import org.apache.http.HttpHost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;


/**
 *
 *
 */
public class PostingServiceImpl implements PostingService{

  private static CloseableHttpClient CLIENT = HttpClients.createDefault();

  private static HttpHost SEARCH_HOST = new HttpHost("http://search.3taps.com");


  @Override
  public void listNearbyRentals(LatLng latLng, long distance, DistanceUnit unit) {



  }
}
