package com.enviro.assesment.grad001.nickmpenyana.waste_management_app.service;

import com.enviro.assesment.grad001.nickmpenyana.waste_management_app.entity.WasteCategory;
import com.enviro.assesment.grad001.nickmpenyana.waste_management_app.repository.WasteRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class WasteCategoryService {
    private final WasteRepository repository;

    public WasteCategoryService(WasteRepository repository) {
        this.repository = repository;
    }

    public List<WasteCategory> getAllCategories() {
        return repository.findAll();
    }

    public WasteCategory getCategoryById(UUID id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Category not found with id: " + id));
    }

    public WasteCategory createWasteCategory(WasteCategory category) {
        return repository.save(category);
    }

    public WasteCategory updateCategory(UUID id, WasteCategory category) {
        if (!repository.existsById(id)) {
            throw  new EntityNotFoundException("Category not found with id: " + id);
        }
        category.setId(id);
        return repository.save(category);
    }

    public void deleteCategory(UUID id, WasteCategory category) {
        if (!repository.existsById(id)) {
            throw  new EntityNotFoundException("Category not found with id: " + id);
        }
        repository.delete(category);
    }
}
