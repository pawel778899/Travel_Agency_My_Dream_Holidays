package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Trip;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.TripService;

@Controller
public class TripController {

    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    //Prezentacja promowanych 3 wycieczek
    @GetMapping("/threePromoted")
    public String threePromotedTrips(ModelMap modelMap) {
        modelMap.addAttribute("threePromotedTrips", tripService.getThreePromotedTrips());
        return "threePromotedTrips";
    }

    //Wszystkie oferty
    @GetMapping("/trips")
    public String allTripList(ModelMap modelMap) {
        modelMap.addAttribute("trips", tripService.getAllTripList());
        return "allTrips";
    }

    //Opis wycieczek
    @GetMapping("/trips/{id}")
    public String displayTripDescription(@PathVariable Long id, ModelMap modelMap) {
        Trip trip = tripService.getById(id);
        modelMap.addAttribute("trip", trip);
        return "tripDescription";
    }

    //Prezentacja 3 wycieczek zbliżających się (globalnie)
    @GetMapping("/threeClosest")
    public String threeClosestTrips(ModelMap modelMap) {
        modelMap.addAttribute("threeClosestTrips", tripService.getThreeClosestTrips());
        return "threeClosestTrips";
    }

    //3 Zbliżające się wycieczki z każdego kontynentu, posortowane po startDate i kontynenncie

    @GetMapping("/threeClosestTripsForEveryContinent")
    public String threeClosestTripsByContinent(ModelMap modelMap) {
        modelMap.addAttribute("threeClosestTripsForEveryContinent", tripService.getThreeClosestTripsForEveryContinent());
        return "threeClosestTripsForEveryContinent";
    }

}