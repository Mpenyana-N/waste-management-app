package com.enviro.assesment.grad001.nickmpenyana.waste_management_app.repository;

import com.enviro.assesment.grad001.nickmpenyana.waste_management_app.entity.DisposalGuidelinesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DisposalGuidelinesRepository extends JpaRepository<DisposalGuidelinesEntity, UUID> {
}
