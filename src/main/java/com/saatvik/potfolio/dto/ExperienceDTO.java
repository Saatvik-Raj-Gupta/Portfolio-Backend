package com.saatvik.potfolio.dto;

import java.util.List;

public class ExperienceDTO {
    private String company;
    private String role;
    private String duration;
    private List<String> responsibilities;
    private List<String> achievements;

    // Constructor
    public ExperienceDTO(String company, String role, String duration, List<String> responsibilities, List<String> achievements) {
        this.company = company;
        this.role = role;
        this.duration = duration;
        this.responsibilities = responsibilities;
        this.achievements = achievements;
    }

    // Getters and Setters
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<String> getResponsibilities() {
        return responsibilities;
    }
    public void setResponsibilities(List<String> responsibilities) {
        this.responsibilities = responsibilities;
    }

    public List<String> getAchievements() {
        return achievements;
    }
    public void setAchievements(List<String> achievements) {
        this.achievements = achievements;
    }
}
