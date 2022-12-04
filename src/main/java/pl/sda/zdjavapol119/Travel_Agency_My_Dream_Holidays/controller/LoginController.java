package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "loginPanel";
    }

//    @GetMapping("/logout")
//    public RedirectView logout(HttpServletRequest request, HttpServletResponse response) {
//
//        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//
//        if (authentication != null) {
//            new SecurityContextLogoutHandler().logout(request, response, authentication);
//        }
//
//        return new RedirectView("/");
//    }
}
