package com.saatvik.potfolio.controller;

import com.saatvik.potfolio.dto.ExperienceDTO;
import com.saatvik.potfolio.service.ExperienceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/api")
class ExperienceController {

    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping("/experience")
    public List<ExperienceDTO> getExperience() {
        return experienceService.getAllExperiences();
    }

}
