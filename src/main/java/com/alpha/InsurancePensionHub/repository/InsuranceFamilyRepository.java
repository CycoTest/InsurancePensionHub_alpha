package com.alpha.InsurancePensionHub.repository;

import com.alpha.InsurancePensionHub.domain.insurance.InsuranceFamily;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InsuranceFamilyRepository extends JpaRepository<InsuranceFamily, Integer> {
    List<InsuranceFamily> findAll();
}
