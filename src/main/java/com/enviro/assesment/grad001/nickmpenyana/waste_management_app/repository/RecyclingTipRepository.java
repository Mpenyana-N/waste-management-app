package com.enviro.assesment.grad001.nickmpenyana.waste_management_app.repository;

import com.enviro.assesment.grad001.nickmpenyana.waste_management_app.entity.RecyclingTipsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RecyclingTipRepository extends JpaRepository<RecyclingTipsEntity, UUID> {
}
