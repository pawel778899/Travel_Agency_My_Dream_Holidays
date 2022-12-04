package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Client;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.PurchasedTrip;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Trip;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.ClientService;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.PurchaseTripService;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.TripService;

import javax.transaction.Transactional;

@Controller
public class PurchasedTripController {

    private final PurchaseTripService purchaseTripService;


    private final ClientService clientService;


    private final TripService tripService;

    public PurchasedTripController(PurchaseTripService purchaseTripService, ClientService clientService, TripService tripService) {
        this.purchaseTripService = purchaseTripService;
        this.clientService = clientService;
        this.tripService = tripService;
    }
    // private Tour tourObject;



    @Transactional
    @GetMapping(path = "/trip/purchaseTrip/{id}")
    public String purchaseTripSheet(@PathVariable Long id, ModelMap modelMap) {
        PurchasedTrip purchasedTrip = new PurchasedTrip();
        Trip trip = tripService.getById(id);
        purchasedTrip.setTrip(trip);
        modelMap.addAttribute("newPurchasedTrip", purchasedTrip);
        modelMap.addAttribute("client", new Client());
        modelMap.addAttribute("trip", trip);


        return "tripPurchase";
    }




}
