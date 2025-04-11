package mk.portfolio.model;

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
  String projectId;
  String title;
  String description;
  String imageUrl;
  String repoLink;
  String demoLink;
  String stack;
}
