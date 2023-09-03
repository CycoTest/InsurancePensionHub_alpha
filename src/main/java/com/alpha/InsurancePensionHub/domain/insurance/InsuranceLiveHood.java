package com.alpha.InsurancePensionHub.domain.insurance;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class InsuranceLiveHood {

    @Id
    @GeneratedValue
    private int no;
    private String title;
    private String category;
    private String content;
    private LocalDate createdAt;
    private LocalDate editedAt;
}
