package com.enviro.assesment.grad001.nickmpenyana.waste_management_app.controller;

import com.enviro.assesment.grad001.nickmpenyana.waste_management_app.entity.DisposalGuidelinesEntity;
import com.enviro.assesment.grad001.nickmpenyana.waste_management_app.service.DisposalGuidelinesService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/guidelines")
public class DisposalGuidelinesController {
    private final DisposalGuidelinesService guidelinesService;

    public DisposalGuidelinesController(DisposalGuidelinesService guidelinesService) {
        this.guidelinesService = guidelinesService;
    }

    @GetMapping
    public List<DisposalGuidelinesEntity> getAllGuidelines() {
        return guidelinesService.getAllGuidelines();
    }

    @GetMapping("/guideline/{id}")
    public DisposalGuidelinesEntity getGuideline(@PathVariable UUID id) {
        return guidelinesService.getGuideline(id);
    }

    @PostMapping("/createGuideline")
    public ResponseEntity<DisposalGuidelinesEntity> createGuideline(@Valid @RequestBody DisposalGuidelinesEntity guidelinesEntity) {
        return ResponseEntity.status(HttpStatus.CREATED).body(guidelinesService.createGuidelines(guidelinesEntity));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<DisposalGuidelinesEntity> updateGuideline(@PathVariable UUID id, @Valid @RequestBody DisposalGuidelinesEntity guidelinesEntity) {
       return ResponseEntity.status(HttpStatus.OK).body(guidelinesService.updateGuideline(id, guidelinesEntity));
    }

    @DeleteMapping("delete/{id}")
    public void deleteGuideline(@PathVariable UUID id, DisposalGuidelinesEntity guidelinesEntity) {
        guidelinesService.deleteGuideline(id, guidelinesEntity);
    }


}
