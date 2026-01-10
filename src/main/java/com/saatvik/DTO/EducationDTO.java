package com.saatvik.DTO;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
class EducationDTO {
    private String instituteName;
    private String degree;
    private String fieldOfStudy;
    private Date startDate;
    private Date endDate;
    private Double grade;
    private String[] subjects;

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

    public Date getStartDate(){
        return this.startDate;
    }
    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

    public Date getEndDate(){
        return this.endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getGrade(){
        return this.grade;
    }
    public void setGrade(Double grade){
        this.grade = grade;
    }

    public String[] getSubjects(){
        return this.subjects;
    }
    public void setSubjects(String[] subjects){
        this.subjects = subjects;
    }
}
