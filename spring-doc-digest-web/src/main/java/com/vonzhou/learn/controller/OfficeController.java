package com.vonzhou.learn.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by vonzhou on 16/7/22.
 */
@Controller
@RequestMapping(value = "/office")
public class OfficeController {

    @RequestMapping(value = "/home")
    public String officeHome(HttpServletRequest request, HttpServletResponse response){
        return "officeHome";
    }

    @RequestMapping(value = "/error")
    public String error(){
        return "notOfficePage";
    }
}
