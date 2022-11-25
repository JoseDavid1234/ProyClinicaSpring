package com.grupo2.proyclinicaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {

    @GetMapping({"/principal","/",""})
    public String getPrincipal(){
        return "principal";
    }

}
