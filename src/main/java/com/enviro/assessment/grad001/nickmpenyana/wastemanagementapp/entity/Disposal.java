package com.enviro.assessment.grad001.nickmpenyana.wastemanagementapp.entity;

import jakarta.persistence.*;

@Entity
public class Disposal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String guidelines;
    @ManyToOne
    private final Category category;

    public Disposal(Category category) {
        this.category = category;
    }

    public Disposal(long id, String guidelines, Category category) {
        this.id = id;
        this.guidelines = guidelines;
        this.category = category;
    }

    public String getGuidelines() {
        return guidelines;
    }

    public void setGuidelines(String guidelines) {
        this.guidelines = guidelines;
    }

    public Category getCategory() {
        return category;
    }
}
