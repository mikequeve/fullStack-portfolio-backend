package mk.portfolio.service;

import mk.portfolio.model.Project;
import mk.portfolio.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService implements IProjectService{

  @Autowired
  private ProjectRepository projectRepository;

  @Override
  public List<Project> showProjects() {
    return projectRepository.findAll();
  }

  @Override
  public Project showProjectById(String projectId) {
    Project project = projectRepository.findById(projectId).orElse(null);
    return project;
  }
}
