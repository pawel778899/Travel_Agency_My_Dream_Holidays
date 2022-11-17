package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service;

import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Trip;

import java.util.List;

public interface TripService {

    List<Trip> get3PromotedTrips();
    List<Trip> get3ComingTrips();

    List<Trip> getAllTripList();
}
