package com.vural.ssl;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@org.springframework.stereotype.Controller
public class Controller {


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello SSL...";
    }
}
