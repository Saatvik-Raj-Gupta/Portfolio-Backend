package com.saatvik.potfolio.dto;

public enum Category {
    LANGUAGE,
    FRAMEWORK,
    TOOL,
    DATABASE,
    CLOUD,
    ML_DL("ML/DL");

    private final String displayName;

    Category() { this.displayName = name(); }
    Category(String displayName) { this.displayName = displayName; }

    @Override
    public String toString() { return displayName; }
}
