package com.enviro.assesment.grad001.nickmpenyana.waste_management_app.service;

import com.enviro.assesment.grad001.nickmpenyana.waste_management_app.entity.DisposalGuidelinesEntity;
import com.enviro.assesment.grad001.nickmpenyana.waste_management_app.repository.DisposalGuidelinesRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DisposalGuidelinesService {
    private final DisposalGuidelinesRepository guidelinesRepository;

    public DisposalGuidelinesService(DisposalGuidelinesRepository guidelinesRepository) {
        this.guidelinesRepository = guidelinesRepository;
    }

    public List<DisposalGuidelinesEntity> getAllGuidelines() {
        return guidelinesRepository.findAll();
    }

    public DisposalGuidelinesEntity createGuidelines(DisposalGuidelinesEntity guidelinesEntity) {
        return guidelinesRepository.save(guidelinesEntity);
    }

    public DisposalGuidelinesEntity getGuideline(UUID id) {
        return guidelinesRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Guideline not found with id: " + id)
        );
    }

    public DisposalGuidelinesEntity updateGuideline(UUID id, DisposalGuidelinesEntity guidelinesEntity) {
        if (!guidelinesRepository.existsById(id)) {
            throw new EntityNotFoundException("Guideline not found with id: " + id);
        }
        guidelinesEntity.setId(id);
       return guidelinesRepository.save(guidelinesEntity);
    }

    public void deleteGuideline(UUID id, DisposalGuidelinesEntity guidelinesEntity) {
        if (!guidelinesRepository.existsById(id)) {
            throw new EntityNotFoundException("Guideline not found with id: " + id);
        }
        guidelinesRepository.delete(guidelinesEntity);
    }
}
