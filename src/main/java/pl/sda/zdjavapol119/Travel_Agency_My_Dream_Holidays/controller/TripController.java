package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.TripService;

public class TripController {

    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @GetMapping("/trips")
    public String threePromotedTrips(ModelMap modelMap) {

        modelMap.addAttribute("allPromotedTrips", tripService.getThreePromotedTrips());
        return "three-promoted-trips";
    }

    @GetMapping("/all")
    public String allTripList(ModelMap modelMap) {
        modelMap.addAttribute("trips", tripService.getAllTripList());
        return "all";
    }
}
