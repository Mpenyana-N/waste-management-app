package com.enviro.assesment.grad001.nickmpenyana.waste_management_app.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

@Entity
@Table(name = "recycling_tips")
public class RecyclingTipsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)

    private UUID id;
    @NotBlank(message = "Title is required")
    private String title;
    @NotBlank(message = "Tip is required")
    private String tip;

    public RecyclingTipsEntity() {
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

    public void setTitle(String name) {
        this.title = name;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
