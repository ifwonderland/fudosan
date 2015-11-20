package com.fudosaninvestor.fudosan.posting;

import com.fudosaninvestor.fudosan.posting.model.DistanceUnit;
import com.google.maps.model.LatLng;


/**
 * Posting related services
 */
public interface PostingService {

  /**
   * List all nearby rentals given distance
   *
   * @param latLng
   * @param distance
   * @param unit
   */
  void listNearbyRentals(final LatLng latLng, final long distance, final DistanceUnit unit);
}
