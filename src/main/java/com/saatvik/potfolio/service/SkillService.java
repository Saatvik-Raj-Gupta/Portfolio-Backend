package com.saatvik.potfolio.service;

import com.saatvik.potfolio.dto.Category;
import com.saatvik.potfolio.dto.Proficiency;
import com.saatvik.potfolio.dto.SkillDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SkillService {
    public List<SkillDTO> getSkill(){
        // Implementation to fetch skills
        return new ArrayList<>(Arrays.asList(
            new SkillDTO("Java", Category.LANGUAGE, Proficiency.ADVANCED),
            new SkillDTO("Python", Category.LANGUAGE, Proficiency.ADVANCED),
            new SkillDTO("TypeScript",  Category.LANGUAGE,Proficiency.INTERMEDIATE),
            new SkillDTO("Spring Boot", Category.FRAMEWORK, Proficiency.INTERMEDIATE),
            new SkillDTO("React", Category.FRAMEWORK, Proficiency.INTERMEDIATE),
            new SkillDTO("SQL", Category.DATABASE, Proficiency.ADVANCED),
            new SkillDTO("MongoDB",   Category.DATABASE,Proficiency.INTERMEDIATE),
            new SkillDTO("PyTorch", Category.ML_DL, Proficiency.ADVANCED),
            new SkillDTO("Scikit-Learn",   Category.ML_DL,Proficiency.ADVANCED) ,
            new SkillDTO("LLms (Gemini, GPT-4)",   Category.ML_DL,Proficiency.INTERMEDIATE),
            new SkillDTO("Docker",  Category.TOOL,Proficiency.BEGINNER),
            new SkillDTO("Git & GitHub", Category.TOOL,Proficiency.ADVANCED),
            new SkillDTO("Kubernetes", Category.TOOL,Proficiency.BEGINNER),
            new SkillDTO("AWS", Category.CLOUD,Proficiency.BEGINNER)
        ));
    }
}
