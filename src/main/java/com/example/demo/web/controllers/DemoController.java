package com.example.demo.web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Balaji Varadharajan
 * Date: 4/23/2021
 * Time: 1:02 PM
 * To change this template use File | Settings | File and Code Templates.
 */
@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @GetMapping
    public String demo(){
        return "Hello World!!!";
    }
}
