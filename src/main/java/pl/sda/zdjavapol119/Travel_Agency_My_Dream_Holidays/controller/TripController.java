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
    public String tourList(ModelMap modelMap) {

        modelMap.addAttribute("promotedTours", tripService.get3PromotedTrips());
        modelMap.addAttribute("comingTours", tripService.get3ComingTrips());
        modelMap.addAttribute("tours", tripService.getAllTripList());
//        modelMap.addAttribute("filteredTours", filteredTours);
//        modelMap.addAttribute("activeFilter", activeFilter);

        return "trip-list";
    }
}
