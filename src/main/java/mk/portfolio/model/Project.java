package mk.portfolio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Project {

  @Id
  @Column(name = "project_id")
  String projectId;

  String title;
  String description;

  @Column(name = "image_url", length = 1024)
  String imageUrl;
  @Column(name = "repo_link", length = 512)
  String repoLink;
  @Column(name = "demo_link", length = 512)
  String demoLink;

  String stack;
}
