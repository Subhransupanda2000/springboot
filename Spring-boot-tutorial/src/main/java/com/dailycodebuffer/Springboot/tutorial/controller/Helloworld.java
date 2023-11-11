package com.dailycodebuffer.Springboot.tutorial.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;

import java.awt.print.Book;

@RestController
public class Helloworld {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String helloworld()
    {

        return "hello";
    }




}
