package com.ecampus.controller;

import com.ecampus.model.Institute;
import com.ecampus.service.InstituteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/institute")
@RequiredArgsConstructor
public class InstituteController {
    private final InstituteService instituteService;
    @PostMapping()
    public Institute addInsitute(@RequestBody Institute institute)
    {
        return instituteService.addInstitute(institute);
    }
}
