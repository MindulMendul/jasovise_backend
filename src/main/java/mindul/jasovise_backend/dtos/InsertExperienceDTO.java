package mindul.jasovise_backend.dtos;

import java.sql.Date;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor()
@NoArgsConstructor()
@Setter
@Getter
@Builder
public class InsertExperienceDTO {
  @NotNull(message = "userId은 null일 수 없습니다.")
  private int userId;

  @NotNull(message = "userId은 null일 수 없습니다.")
  private String title;

  @NotNull(message = "userId은 null일 수 없습니다.")
  private String content;

  @NotNull(message = "userId은 null일 수 없습니다.")
  private Date createdAt;
}
