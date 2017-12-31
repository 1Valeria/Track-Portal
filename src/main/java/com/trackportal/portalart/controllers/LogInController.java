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
public class LogInController  {

    @GetMapping("/login")
    public ModelAndView index() throws MalformedURLException {
        Map<String, String> model = new HashMap<>();

        model.put("name", "Hello World");

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\static\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.vk.com");

        WebElement loginField = driver.findElement(By.id("index_email"));
        WebElement passwordField = driver.findElement(By.id("index_pass"));

        //todo: login and password
        loginField.sendKeys("");
        passwordField.sendKeys("");

        passwordField.submit();

        System.out.println("Page title is: " + driver.getTitle());

//        driver.quit();

        return new ModelAndView("index", model);
    }
}
