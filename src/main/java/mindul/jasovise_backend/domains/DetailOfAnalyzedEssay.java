package mindul.jasovise_backend.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="detail_of_analyzed_essay")
@AllArgsConstructor()
@NoArgsConstructor()
@Setter
@Getter
@Builder
public class DetailOfAnalyzedEssay {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "analyzedEssay_id", nullable = false)
  private int analyzedEssayId;

  @Column(name="title", nullable = false)
  private String title;

  @Column(name="score", nullable = false)
  private String score;

  @Column(name="comment", nullable = false)
  private String comment;
}
