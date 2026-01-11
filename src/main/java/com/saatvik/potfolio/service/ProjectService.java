package com.saatvik.potfolio.service;

import com.saatvik.potfolio.dto.ProjectDTO;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProjectService {

    public List<ProjectDTO> getProject() {
        ProjectDTO project1 = new ProjectDTO();
        project1.setTitle("Manga Translation System");
        project1.setShortDescription("A web application for translating manga from Japanese to English.");
        project1.setDetailedDescription("Developed a full-stack web application that allows users to upload manga images, translate text using OCR and machine translation APIs, and download the translated manga. Implemented image processing, and a user-friendly interface.");
        project1.setTechStack(java.util.Arrays.asList("Python", "PyTorch", "OPenCV", "REACT", "FASTAPI"));
        project1.setRole("ML Developer");
        project1.setHighlights("Automated manga text detection and translation | Achieved 95% text detection accuracy | End-to-end pipeline from image to translated output");
        project1.setGitHubLink("");

        ProjectDTO project2 = new ProjectDTO();
        project2.setTitle("BERT Text Summarization");
        project2.setShortDescription("A text summarization tool using BERT transformer models.");
        project2.setDetailedDescription("Implemented a text summarization application leveraging pre-trained BERT models. Fine-tuned the model on a custom dataset to improve summary quality. Developed a web interface for users to input text and receive concise summaries.");
        project2.setTechStack(java.util.Arrays.asList("Python", "TensorFlow", "BERT", "Streamlit"));
        project2.setRole("ML Engineer");
        project2.setHighlights("Fine-tuned BERT for abstractive summarization | Achieved ROUGE-1 score of 0.45 | User-friendly web interface for text input and summary output");
        project2.setGitHubLink("https://github.com/Saatvik-Raj-Gupta/BERT_Summarizer.git");

        return List.of(project1, project2);
    }
}
