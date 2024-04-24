package com.enviro.assessment.grad001.nickmpenyana.wastemanagementapp.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private  String name;
    private  String description;
    @OneToMany
    private List<Disposal>  disposal;

    public Category(long id, String name, String description, List<Disposal> disposal) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.disposal = disposal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Disposal> getDisposal() {
        return disposal;
    }

    public void setDisposal(List<Disposal> disposal) {
        this.disposal = disposal;
    }
}
