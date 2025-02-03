package mindul.jasovise_backend.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="question")
@AllArgsConstructor()
@NoArgsConstructor()
@Setter
@Getter
@Builder

public class Question {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name="theme_id", nullable = false)
  private String username;

  @Column(name="question", nullable = false)
  private String password;
}
