package com.enviro.assesment.grad001.nickmpenyana.waste_management_app.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "recycling_tips")
public class RecyclingTipsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)

    private UUID id;
    private String name;
    private String tip;

    public RecyclingTipsEntity() {
    }

    public RecyclingTipsEntity(String name, String tip) {
        this.name = name;
        this.tip = tip;
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

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
