package com.alpha.InsurancePensionHub.service;

import com.alpha.InsurancePensionHub.domain.insurance.InsuranceFamily;
import com.alpha.InsurancePensionHub.repository.InsuranceFamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsuranceFamilyService {
    private final InsuranceFamilyRepository insuranceFamilyRepository;

    @Autowired
    public InsuranceFamilyService(InsuranceFamilyRepository insuranceFamilyRepository) {
        this.insuranceFamilyRepository = insuranceFamilyRepository;
    }

    public List<InsuranceFamily> getAllPosts() {
        return insuranceFamilyRepository.findAll();
    }
}
