package com.hari.fundmgmt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class viewsController {

    @GetMapping("createAccountPage")
    public String createAccountPage() {
        return "home.jsp";
    }

}
