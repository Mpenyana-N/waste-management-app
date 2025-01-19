package com.enviro.assesment.grad001.nickmpenyana.waste_management_app.controller;

import com.enviro.assesment.grad001.nickmpenyana.waste_management_app.entity.RecyclingTipsEntity;
import com.enviro.assesment.grad001.nickmpenyana.waste_management_app.service.RecyclingTipService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/tips")
public class RecyclingTipsController {
    private final RecyclingTipService recyclingTipService;

    public RecyclingTipsController(RecyclingTipService recyclingTipService) {
        this.recyclingTipService = recyclingTipService;
    }

    @GetMapping
    public List<RecyclingTipsEntity> getAllTips() {
       return recyclingTipService.getAllTips();
    }

    @GetMapping("/tip/{id}")
    public RecyclingTipsEntity getTip(@PathVariable UUID id) {
      return   recyclingTipService.getTip(id);
    }

    @PostMapping("/create")
    public ResponseEntity<RecyclingTipsEntity> createTip(@Valid @RequestBody RecyclingTipsEntity recyclingTipsEntity) {
        return ResponseEntity.status(HttpStatus.CREATED).body(recyclingTipService.createTip(recyclingTipsEntity));
    }

    @PutMapping("/update/{id}")
    public RecyclingTipsEntity updateTip(@PathVariable UUID id, @Valid @RequestBody RecyclingTipsEntity recyclingTipsEntity) {
        return recyclingTipService.updateTip(id, recyclingTipsEntity);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTip(@PathVariable UUID id, RecyclingTipsEntity recyclingTipsEntity) {
        recyclingTipService.deleteTip(id, recyclingTipsEntity);
    }
}
