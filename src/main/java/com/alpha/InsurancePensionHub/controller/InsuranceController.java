package com.alpha.InsurancePensionHub.controller;

import com.alpha.InsurancePensionHub.domain.common.BoardSearch;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class InsuranceController {

    @GetMapping("/insurance")
    public String insuranceHome() {

        return "navigation/insurance/insurance";
    }

    @GetMapping("/insurance/family")
    public String goToFamily() {

        return "navigation/insurance/planFamily";
    }

    @GetMapping("/insurance/search")
    public String handleSubmit(@ModelAttribute("boardSearch") BoardSearch boardSearch) {

        return "redirect:/insurance";
    }

}
