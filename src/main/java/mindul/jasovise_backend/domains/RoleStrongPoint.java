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

@Entity(name="role_strongpoint")
@AllArgsConstructor()
@NoArgsConstructor()
@Setter
@Getter
@Builder

public class RoleStrongPoint {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "role_id", nullable = false)
  private int roleId;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "strongPoint_id", nullable = false)
  private int strongPointId;
}
