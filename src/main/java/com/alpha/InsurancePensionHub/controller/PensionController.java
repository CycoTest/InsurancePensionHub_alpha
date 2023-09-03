package com.alpha.InsurancePensionHub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PensionController {

    @GetMapping("/pension")
    public String pensionHom() {

        return "pension";
    }
}
