package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.AirportService;

@Controller
public class AirportController {

    private final AirportService airportService;

    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }

    @GetMapping("/airports")
    public String allAirportsList(ModelMap modelMap) {
        modelMap.addAttribute("airports", airportService.findAll());
        return "airport";
    }
}
