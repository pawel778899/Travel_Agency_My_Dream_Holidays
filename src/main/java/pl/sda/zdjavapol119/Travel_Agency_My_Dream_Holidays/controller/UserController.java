package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/allRegisteredUsers")
    public String displayAllRegisteredUsers(ModelMap modelMap) {
        modelMap.addAttribute("registeredUsers", userService.findAll());
        return "allRegisteredUsers";
    }

}
