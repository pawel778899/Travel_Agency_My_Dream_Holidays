package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service;

import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Trip;

import java.util.List;

public interface TripService {

    List<Trip> getThreePromotedTrips();
    List<Trip> getThreeClosestTrips();

    List<Trip> getAllTripList();
    Trip getById(Long id);

    List<Trip> getThreeClosestTripsForEveryContinent();

}
