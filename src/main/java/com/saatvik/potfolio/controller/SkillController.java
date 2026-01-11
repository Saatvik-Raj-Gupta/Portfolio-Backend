package com.saatvik.potfolio.controller;

import com.saatvik.potfolio.dto.SkillDTO;
import com.saatvik.potfolio.service.SkillService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/api")
class SkillController {

    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping("/skills")
    public List<SkillDTO> getSkills() {
        return skillService.getSkill();
    }

}
