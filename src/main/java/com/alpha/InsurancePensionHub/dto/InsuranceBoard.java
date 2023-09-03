package com.alpha.InsurancePensionHub.dto;

import com.alpha.InsurancePensionHub.domain.insurance.InsuranceFamily;
import com.alpha.InsurancePensionHub.domain.insurance.InsuranceLiveHood;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor
@ToString
public class InsuranceBoard {

    private int id;
    private String title;
    private String category;
    private String content;
    private LocalDate createdAt;
    private LocalDate editedAt;

    public InsuranceFamily toInsuranceFamilyEntity() {

        return new InsuranceFamily(id, title, content, category, createdAt, editedAt);
    }

    public InsuranceLiveHood toInsuranceLiveHoodEntity() {

        return new InsuranceLiveHood(id, title, content, category, createdAt, editedAt);
    }
}
