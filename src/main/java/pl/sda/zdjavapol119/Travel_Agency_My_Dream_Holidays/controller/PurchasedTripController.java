package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Client;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.PurchasedTrip;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Trip;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.ClientService;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.PurchaseTripService;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.TripService;

import javax.transaction.Transactional;

@Slf4j
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
    private Trip trip2;



    @Transactional
    @GetMapping("/trip/purchaseTrip/{id}")
    public String purchaseTripSheet(@PathVariable Long id, ModelMap modelMap) {
        PurchasedTrip purchasedTrip = new PurchasedTrip();
        Trip trip2 = tripService.getById(id);
        purchasedTrip.setTrip(trip2);
        modelMap.addAttribute("newPurchasedTrip", purchasedTrip);
        modelMap.addAttribute("client", new Client());
        modelMap.addAttribute("trip", trip2);


        return "tripPurchase";
    }
    @Transactional
    @PostMapping("/trips/save")
    public String purchaseTripSave(@ModelAttribute("newPurchasedTrip") PurchasedTrip purchasedTrip, @ModelAttribute("client") Client client) {
        clientService.save(client);
        log.info(client + "was added." + client);

        tripService.save(trip2,purchasedTrip);

        purchaseTripService.save(purchasedTrip, client, trip2);
        log.info(purchasedTrip +"was purchased.");

        return "/tripPurchase2";
    }



}
