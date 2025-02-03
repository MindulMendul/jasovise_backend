package mindul.jasovise_backend.domains;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="analyzed_experience")
@AllArgsConstructor()
@NoArgsConstructor()
@Setter
@Getter
@Builder

public class AnalyzedExperience {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "essay_id", nullable = false)
  private int essayId;

  @Column(name="title", nullable = false)
  private String title;

  @Column(name="content", nullable = false)
  private String content;

  @Column(name="created_at", nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private Date createdAt;
}
