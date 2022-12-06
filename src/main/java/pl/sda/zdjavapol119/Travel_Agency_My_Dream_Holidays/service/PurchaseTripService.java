package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service;

import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Client;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.PurchasedTrip;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Trip;

import java.util.List;

public interface PurchaseTripService {

    List<PurchasedTrip> findAll();

    void save(PurchasedTrip purchasedTrip, Client client, Trip trip);
    void calculateAllRequiredCost(PurchasedTrip purchasedTrip);

}
