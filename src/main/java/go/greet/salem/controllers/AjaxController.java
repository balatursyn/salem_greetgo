package go.greet.salem.controllers;

import go.greet.salem.InfoGetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

    @Autowired
    InfoGetter infoGetter;

    @RequestMapping(value = "/response", method = RequestMethod.GET)
    public @ResponseBody
    String script() {
        String text = infoGetter.getById(1);
        String result = text ;
        return result;
    }
}
