package com.examplebackend.Backend.services;

import com.examplebackend.Backend.domain.Project;
import com.examplebackend.Backend.exceptions.ProjectIdException;
import com.examplebackend.Backend.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {
        Project databaseProject = findProjectByIdentifier(project.getProjectIdentifier());
        project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
        if (databaseProject.getProjectIdentifier().toUpperCase() == project.getProjectIdentifier().toUpperCase()) {
            throw new ProjectIdException("Project ID, " + project.getProjectIdentifier().toUpperCase() + " already exists!");
        }
        return projectRepository.save(project);
    }

    public Project findProjectByIdentifier(String projectId) {
        Project project = projectRepository.findByProjectIdentifier(projectId.toUpperCase());
        if (project == null) {
            throw new ProjectIdException("No project by selected identifier");
        }
        return project;
    }

    public Iterable<Project> findAllProjects() {
        return projectRepository.findAll();
    }
}
