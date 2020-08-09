package com.examplebackend.Backend.repositories;

import com.examplebackend.Backend.domain.AminoAcid;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AminoAcidRepository extends CrudRepository<AminoAcid, Long> {

    @Override
    Iterable<AminoAcid> findAll();
}
