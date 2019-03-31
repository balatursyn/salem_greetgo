package go.greet.salem.controllers;

import go.greet.salem.InfoGetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    InfoGetter infoGetter;

    @RequestMapping("/")
    public String home() {

        return "index";
    }
}
