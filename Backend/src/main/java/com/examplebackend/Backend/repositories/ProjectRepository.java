package com.examplebackend.Backend.repositories;

import com.examplebackend.Backend.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    @Override
    Iterable<Project> findAllById(Iterable<Long> iterable);

    @Override
    Iterable<Project> findAll();

    Project findByProjectIdentifier(String projectId);
}
