package com.examplebackend.Backend.web;

import com.examplebackend.Backend.domain.AminoAcid;
import com.examplebackend.Backend.services.AminoAcidService;
import com.examplebackend.Backend.services.MapValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.examplebackend.Backend.web.MappingConstants.ALL_AMINOS_URL;

@RestController
@RequestMapping("/api/aminoacids")
@CrossOrigin
public class AminoAcidController {


    @Autowired
    AminoAcidService aminoAcidService;

    @Autowired
    MapValidationService mapValidationService;

    @GetMapping(ALL_AMINOS_URL)
    public Iterable<AminoAcid> getAllAminoAcids() {
        return aminoAcidService.findAllAminoAcids();
    }

    @GetMapping("/{aminoId}")
    public ResponseEntity<?> getAminoAcid(@PathVariable Long aminoId) {
        AminoAcid aminoAcid = aminoAcidService.findAminoAcid(aminoId);
        return new ResponseEntity<AminoAcid>(aminoAcid, HttpStatus.OK);
    }
}
