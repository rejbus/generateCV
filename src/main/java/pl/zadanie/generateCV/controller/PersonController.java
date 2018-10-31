package pl.zadanie.generateCV.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.zadanie.generateCV.model.Person;

@Controller
public class PersonController {

    @GetMapping("/")
    public String showFrom(ModelMap modelMap) {
        modelMap.addAttribute("person", new Person());
        return "homePage";

    }
        @PostMapping("/cvform")
        public String generateCV(@ModelAttribute Person person, ModelMap modelmap){
            modelmap.addAttribute("person", person);
            return "generatedCV";
        }




    }

