package com.saatvik.potfolio.service;

import com.saatvik.potfolio.dto.EducationDTO;
import com.saatvik.potfolio.dto.PersonalInfo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

//For Personal and Education DTO only
@Service
public class AboutService {
    public PersonalInfo getPersonalInfo() {
        // Logic to fetch personal info
        PersonalInfo info = new PersonalInfo();
        info.setName("Saatvik Gupta");
        info.setHeadline("AI/ML Engineer | Full Stack Java Developer");
        info.setContactDetails(Map.of(
                "Email", "saatvik.1207gupta@gmail.com",
                "Phone", "+91-9315516515"));
        info.setAbout("I build scalable ML systems and full-stack applications.");
        info.setLinks(Map.of(
                "Github","https://github.com/Saatvik-Raj-Gupta",
                "Linkedin","https://www.linkedin.com/in/saatvik-gupta-ml",
                "Kaggle","https://www.kaggle.com/saatvikrajgupta",
                "Leetcode","https://leetcode.com/u/Saatvik_Raj_Gupta/"));
        return info;
    }

    public List<EducationDTO> getEducationDetails() {
        // Logic to fetch education details
        EducationDTO college = new EducationDTO();
        college.setInstituteName("University School Of Automation and Robotics");
        college.setDegree("Bachelor of Technology");
        college.setFieldOfStudy("Artificial Intelligence and Machine Learning");
        college.setStartDate(LocalDate.of(2021, 8, 1));
        college.setEndDate(LocalDate.of(2025, 7, 31));
        college.setGrade(8.0);
        college.setSubjects(List.of("Data Structures", "Algorithms", "Machine Learning", "Artificial Intelligence",
                "Data Warehousing", "Computer Vision", "Natural Language Processing", "Large Language Models"));

        EducationDTO school = new EducationDTO();
        school.setInstituteName("Bhatnagar International School");
        school.setDegree("Senior Secondary");
        school.setFieldOfStudy("Science Stream");
        school.setStartDate(LocalDate.of(2019, 4, 1));
        school.setEndDate(LocalDate.of(2021, 3, 31));
        school.setGrade(89.0);
        school.setSubjects(List.of("Physics", "Chemistry", "Mathematics", "Computer Science"));

        return List.of(college, school);
    }
}
