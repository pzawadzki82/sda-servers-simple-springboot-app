package pl.sda.sdaserverssimplespringbootapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="firstname", required=false, defaultValue="Jan") String firstname,
                           @RequestParam(name="lastname", required=false, defaultValue="Kowalski") String lastname,
                           Model model) {
        model.addAttribute("firstname", firstname);
        model.addAttribute("lastname", lastname);
        return "greeting";
    }

}