package com.enviro.assesment.grad001.nickmpenyana.waste_management_app.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "disposal_guidelines")
public class DisposalGuidelinesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)

    private UUID id;
    private String name;
    private String guideline;


    public DisposalGuidelinesEntity() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuideline() {
        return guideline;
    }

    public void setGuideline(String guidelines) {
        this.guideline = guidelines;
    }
}
