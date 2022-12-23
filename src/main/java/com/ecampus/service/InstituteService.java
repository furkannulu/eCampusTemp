package com.ecampus.service;

import com.ecampus.model.Institute;
import com.ecampus.repository.InstituteRepository;
import org.springframework.stereotype.Service;

@Service
public class InstituteService {
    private final InstituteRepository instituteRepository;


    public InstituteService(InstituteRepository instituteRepository) {
        this.instituteRepository = instituteRepository;
    }

    public Institute addInstitute(Institute institute) {
        this.instituteRepository.save(institute);
        return institute;
    }
}
