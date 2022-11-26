package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.CityService;

@Controller
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }


    @GetMapping("/cities")
    public String allCitiesList(ModelMap modelMap) {
        modelMap.addAttribute("cities", cityService.findAll());
        return "allcity";
    }
}
