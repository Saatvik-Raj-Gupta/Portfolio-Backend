package com.saatvik.potfolio.dto;

import java.util.Map;

public class PersonalInfo {
    private String name;
    private String headline;
    private Map<String, String> contactDetails;
    private String about;
    private Map<String, String> links;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getHeadline() {
        return this.headline;
    }
    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public Map<String, String> getContactDetails() {
        return this.contactDetails;
    }
    public void setContactDetails(Map<String, String> contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getAbout() {
        return this.about;
    }
    public void setAbout(String about) {
        this.about = about;
    }

    public Map<String, String> getLinks() {
        return this.links;
    }
    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
}
