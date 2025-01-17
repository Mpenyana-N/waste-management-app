package com.enviro.assesment.grad001.nickmpenyana.waste_management_app.repository;

import com.enviro.assesment.grad001.nickmpenyana.waste_management_app.entity.WasteCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WasteRepository extends JpaRepository<WasteCategory, UUID> {
}
