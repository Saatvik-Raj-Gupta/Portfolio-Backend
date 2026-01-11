package com.saatvik.service;

import com.saatvik.dto.Category;
import com.saatvik.dto.Proficiency;
import com.saatvik.dto.SkillDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SkillService {
    public List<SkillDTO> getSkill(){
        // Implementation to fetch skills
        return new ArrayList<>(Arrays.asList(
            new SkillDTO("Java", com.saatvik.dto.Category.LANGUAGE, Proficiency.ADVANCED),
            new SkillDTO("Python", Category.LANGUAGE, Proficiency.ADVANCED),
            new SkillDTO("TypeScript",  com.saatvik.dto.Category.LANGUAGE,Proficiency.INTERMEDIATE),
            new SkillDTO("Spring Boot", com.saatvik.dto.Category.FRAMEWORK, Proficiency.INTERMEDIATE),
            new SkillDTO("React", Category.FRAMEWORK, Proficiency.INTERMEDIATE),
            new SkillDTO("SQL", com.saatvik.dto.Category.DATABASE, Proficiency.ADVANCED),
            new SkillDTO("MongoDB",   Category.DATABASE,Proficiency.INTERMEDIATE),
            new SkillDTO("PyTorch", com.saatvik.dto.Category.ML_DL, Proficiency.ADVANCED),
            new SkillDTO("Scikit-Learn",   Category.ML_DL,Proficiency.ADVANCED) ,
            new SkillDTO("LLms (Gemini, GPT-4)",   Category.ML_DL,Proficiency.INTERMEDIATE),
            new SkillDTO("Docker",  com.saatvik.dto.Category.TOOL,Proficiency.BEGINNER),
            new SkillDTO("Git & GitHub", Category.TOOL,Proficiency.ADVANCED),
            new SkillDTO("Kubernetes", com.saatvik.dto.Category.TOOL,Proficiency.BEGINNER),
            new SkillDTO("AWS", Category.CLOUD,Proficiency.BEGINNER)
        ));
    }
}
