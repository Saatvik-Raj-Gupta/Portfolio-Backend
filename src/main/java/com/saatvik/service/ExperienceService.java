package com.saatvik.service;

import com.saatvik.dto.ExperienceDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {

    public List<ExperienceDTO> getAllExperiences() {
        // Logic to fetch all experiences
        return List.of(
                new ExperienceDTO("Infosys", "System Engineer", "January 2026-Present", List.of(
                        "Work as Developer in FileNet system and its integrations.",
                        "Involved in development and maintenance of FileNet based applications.",
                        "Involved in writing Java based services for FileNet integrations."
                ),List.of()
                ),
                new ExperienceDTO("Infosys", "system Engineer Trainee", "July 2025-December 2025", List.of(
                        "Underwent rigorous training in FileNet, BAW.",
                        "Completed projects simulating real-world scenarios using learned technologies.",
                        "L2 support for IBM FileNet systems provided production incident troubleshooting"),
                List.of()),
                new ExperienceDTO("Infosys", "System Engineer Intern", "January 2025-June 2025", List.of(
                        "Underwent rigorous training in Java, Spring boot and REACT",
                        "Collaborated with the development team to design and implement JSW and Spring security.",
                        "Conducted testing and debugging to ensure application functionality."
                ), List.of()),
                new ExperienceDTO("Prodigal AI", "ML Intern", "September 2024-December 2024", List.of(
                        "Learned Web scrapping using Python libraries such as BeautifulSoup and Scrapy.",
                        "Built datasets for training ML models by scraping data from various websites.",
                        "Assisted in developing and fine-tuning LLM models for specific tasks.",
                        "Built a multi agent system using Langchain to automate web scrapping and data extraction."
                ), List.of())
        ); // Placeholder
    }

}
