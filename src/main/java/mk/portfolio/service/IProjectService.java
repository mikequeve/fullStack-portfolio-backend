package mk.portfolio.service;

import mk.portfolio.model.Project;

import java.util.List;

public interface IProjectService {
  public List<Project> showProjects();
  public Project showProjectById(String projectId);
}
