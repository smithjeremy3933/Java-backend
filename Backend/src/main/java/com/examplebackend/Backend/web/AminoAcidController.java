package com.examplebackend.Backend.web;

import com.examplebackend.Backend.domain.AminoAcid;
import com.examplebackend.Backend.services.AminoAcidService;
import com.examplebackend.Backend.services.MapValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/aminoacids")
public class AminoAcidController {


    @Autowired
    AminoAcidService aminoAcidService;

    @Autowired
    MapValidationService mapValidationService;

    @GetMapping("/all")
    public Iterable<AminoAcid> getAllAminoAcids() {
        return aminoAcidService.findAllAminoAcids();
    }
}
