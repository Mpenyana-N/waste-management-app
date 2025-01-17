package com.enviro.assesment.grad001.nickmpenyana.waste_management_app.controller;

import com.enviro.assesment.grad001.nickmpenyana.waste_management_app.entity.WasteCategory;
import com.enviro.assesment.grad001.nickmpenyana.waste_management_app.service.WasteCategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/categories")
public class WasteCategoryController {
    private final WasteCategoryService categoryService;

    public WasteCategoryController(WasteCategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping()
    public List<WasteCategory> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @PostMapping("/create")
    public ResponseEntity<WasteCategory> createCategory(@RequestBody WasteCategory category) {
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.createWasteCategory(category));
    }

    @GetMapping("/category/{id}")
    public WasteCategory getCategoryById(@PathVariable UUID id) {
      return   categoryService.getCategoryById(id);
    }

    @PutMapping("/{id}")
    public WasteCategory updateWasteCategory(@PathVariable UUID id, @RequestBody WasteCategory category) {
        return categoryService.updateCategory(id);
    }
}
