package com.alpha.InsurancePensionHub.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class InsuranceController {

    @GetMapping("/insurance")
    public String insuranceHome() {

        return "webPage/navigation/insurance/insuranceHome";
    }
}
