package pl.zadanie.generateCV.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.zadanie.generateCV.model.Person;

@Controller
public class PersonController {

    @GetMapping("/")
    public String showFrom(ModelMap modelMap){
        modelMap.addAttribute("person",new Person());
        return "homePage";
    }
}
