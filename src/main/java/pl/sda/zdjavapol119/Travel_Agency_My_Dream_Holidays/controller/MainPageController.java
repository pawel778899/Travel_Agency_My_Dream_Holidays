package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

    @GetMapping("/mainPage")
    String mainPage() {
        return "mainPage";
    }
}
