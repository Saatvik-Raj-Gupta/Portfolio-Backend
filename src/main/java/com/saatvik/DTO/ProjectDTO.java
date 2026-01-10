package com.saatvik.DTO;

import org.springframework.stereotype.Component;

@Component
class ProjectDTO {
    private String title;
    private String shortDescription;
    private String detailedDescription;
    private String[] techStack;
    private String role;
    private String highlights;
    private String gitHubLink;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }
    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    public String[] getTechStack() {
        return techStack;
    }
    public void setTechStack(String[] techStack) {
        this.techStack = techStack;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public String getHighlights() {
        return highlights;
    }
    public void setHighlights(String highlights) {
        this.highlights = highlights;
    }

    public String getGitHubLink() {
        return gitHubLink;
    }
    public void setGitHubLink(String gitHubLink) {
        this.gitHubLink = gitHubLink;
    }
}
