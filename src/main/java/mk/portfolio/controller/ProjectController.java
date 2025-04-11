package mk.portfolio.controller;

import mk.portfolio.exception.NotFoundResourceException;
import mk.portfolio.model.Project;
import mk.portfolio.service.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(value = "https://www.mike-vega.dev/")
public class ProjectController {
  private static  final Logger logger = LoggerFactory.getLogger(ProjectController.class);

  @Autowired
  private ProjectService projectService;

  @GetMapping("/projects")
  public List<Project> getProjects(){
    var projects = projectService.showProjects();
    projects.forEach((project -> logger.info(project.toString())));
    return projects;
  }

  @GetMapping("/projects/{id}")
  public ResponseEntity<Project> getProjectById(@PathVariable String id){
    Project project = projectService.showProjectById(id);
    if(project == null){
      throw new NotFoundResourceException("Resource not found!! " + id);
    }
    return ResponseEntity.ok(project);
  }
}
