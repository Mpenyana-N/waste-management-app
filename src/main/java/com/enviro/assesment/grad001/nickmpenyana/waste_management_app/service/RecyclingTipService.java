package com.enviro.assesment.grad001.nickmpenyana.waste_management_app.service;

import com.enviro.assesment.grad001.nickmpenyana.waste_management_app.entity.RecyclingTipsEntity;
import com.enviro.assesment.grad001.nickmpenyana.waste_management_app.repository.RecyclingTipRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RecyclingTipService {
    private final RecyclingTipRepository recyclingTipRepository;

    public RecyclingTipService(RecyclingTipRepository recyclingTipRepository) {
        this.recyclingTipRepository = recyclingTipRepository;
    }

    public List<RecyclingTipsEntity> getAllTips() {
        return recyclingTipRepository.findAll();
    }

    public RecyclingTipsEntity createTip(RecyclingTipsEntity recyclingTipsEntity) {
        return recyclingTipRepository.save(recyclingTipsEntity);
    }

    public RecyclingTipsEntity getTip(UUID id) {
        return recyclingTipRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Tip not found with id: " + id)
        );
    }

    public RecyclingTipsEntity updateTip(UUID id, RecyclingTipsEntity recyclingTipsEntity) {
        if (!recyclingTipRepository.existsById(id)) {
            throw new EntityNotFoundException("Tip not found with id: " + id);
        }
        recyclingTipsEntity.setId(id);
        return recyclingTipRepository.save(recyclingTipsEntity);
    }

    public void deleteTip(UUID id, RecyclingTipsEntity recyclingTipsEntity) {
        if (!recyclingTipRepository.existsById(id)) {
            throw new EntityNotFoundException("Tip not found with id: " + id);
        }
        recyclingTipRepository.delete(recyclingTipsEntity);
    }
}
