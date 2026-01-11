package com.saatvik.potfolio.controller;

import com.saatvik.potfolio.dto.EducationDTO;
import com.saatvik.potfolio.dto.PersonalInfo;
import com.saatvik.potfolio.service.AboutService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/api/about")
class AboutController {

    private final AboutService aboutService;

    public AboutController(AboutService aboutService) {
        this.aboutService = aboutService;
    }

    @GetMapping("/personal")
    public PersonalInfo getPersonalInfo() {
        return aboutService.getPersonalInfo();
    }

    @GetMapping("/education")
    public List<EducationDTO> getEducation() {
        return aboutService.getEducationDetails();
    }

}
