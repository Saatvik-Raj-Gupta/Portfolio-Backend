package com.saatvik.potfolio.dto;


import java.time.LocalDate;
import java.util.List;

public class EducationDTO {
    private String instituteName;
    private String degree;
    private String fieldOfStudy;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double grade;
    private List<String> subjects;

    public String getInstituteName(){
        return this.instituteName;
    }
    public void setInstituteName(String instituteName){
        this.instituteName = instituteName;
    }

    public String getDegree(){
        return this.degree;
    }
    public void setDegree(String degree){
        this.degree = degree;
    }

    public String getFieldOfStudy(){
        return this.fieldOfStudy;
    }
    public void setFieldOfStudy(String fieldOfStudy){
        this.fieldOfStudy = fieldOfStudy;
    }

    public LocalDate getStartDate(){
        return this.startDate;
    }
    public void setStartDate(LocalDate startDate){
        this.startDate = startDate;
    }

    public LocalDate getEndDate(){
        return this.endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Double getGrade(){
        return this.grade;
    }
    public void setGrade(Double grade){
        this.grade = grade;
    }

    public List<String> getSubjects(){
        return this.subjects;
    }
    public void setSubjects(List<String> subjects){
        this.subjects = subjects;
    }
}
