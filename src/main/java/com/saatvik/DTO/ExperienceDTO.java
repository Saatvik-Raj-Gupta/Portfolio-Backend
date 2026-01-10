package com.saatvik.DTO;

import org.springframework.stereotype.Component;

@Component
class ExperienceDTO {
    private String company;
    private String role;
    private String duration;
    private String[] responsibilities;
    private String[] achievements;

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

    public String[] getResponsibilities() {
        return responsibilities;
    }
    public void setResponsibilities(String[] responsibilities) {
        this.responsibilities = responsibilities;
    }

    public String[] getAchievements() {
        return achievements;
    }
    public void setAchievements(String[] achievements) {
        this.achievements = achievements;
    }
}
