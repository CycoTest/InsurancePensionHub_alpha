package com.alpha.InsurancePensionHub.domain.insurance;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class InsuranceFamily {

    @Id
    @GeneratedValue
    private int no;
    private String title;
    private String content;
    private String category;
    private LocalDate createdAt;
    private LocalDate editedAt;


}
