package com.saatvik.dto;

import org.springframework.stereotype.Component;

@Component
public class SkillDTO {
    private String name;
    private Category category;
    private Proficiency proficiency;

    public SkillDTO(String name, Category category, Proficiency proficiency) {
        this.name = name;
        this.category = category;
        this.proficiency = proficiency;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    public Proficiency getProficiency() {
        return proficiency;
    }
    public void setProficiency(Proficiency proficiency) {
        this.proficiency = proficiency;
    }
}
