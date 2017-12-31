package com.trackportal.portalart.controllers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Valeria Shpakovskaya on 31.12.2017.
 */

@Controller
public class IndexController {

    @GetMapping("/")
    public ModelAndView index() throws MalformedURLException {

        Map<String, String> model = new HashMap<>();
        model.put("name", "Hello World");

        return new ModelAndView("index", model);
    }
}
