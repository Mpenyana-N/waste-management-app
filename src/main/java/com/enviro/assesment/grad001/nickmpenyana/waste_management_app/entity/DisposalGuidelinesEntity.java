package com.enviro.assesment.grad001.nickmpenyana.waste_management_app.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

@Entity
@Table(name = "disposal_guidelines")
public class DisposalGuidelinesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)

    private UUID id;
    @NotBlank(message = "Title is required")
    private String title;
    @NotBlank(message = "Guideline is required")
    private String guideline;


    public DisposalGuidelinesEntity() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGuideline() {
        return guideline;
    }

    public void setGuideline(String guidelines) {
        this.guideline = guidelines;
    }
}
