package com.examplebackend.Backend.services;

import com.examplebackend.Backend.domain.AminoAcid;
import com.examplebackend.Backend.repositories.AminoAcidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AminoAcidService {

    @Autowired
    AminoAcidRepository aminoAcidRepository;

    public Iterable<AminoAcid> findAllAminoAcids() {
        return aminoAcidRepository.findAll();
    }

    public AminoAcid findAminoAcid(Long id) {
        AminoAcid aminoAcid = aminoAcidRepository.getById(id);
        return aminoAcid;
    }
}
