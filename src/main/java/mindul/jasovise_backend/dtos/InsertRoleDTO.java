package mindul.jasovise_backend.dtos;

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
public class InsertRoleDTO {
  @NotNull(message = "memberNum은 null일 수 없습니다.")
    private int memberNum;

    @NotNull(message = "catCode는 null일 수 없습니다.")
    //@Size(min = 2, max = 3, message = "catCode의 크기는 2에서 3 사이입니다.")
    private String catCode;

    //@Size(max = 45, message = "title의 최대 크기는 45입니다.")
    private String title;

    @NotNull(message = "imgUrl은 null일 수 없습니다.")
    //@Size(min = 1, max = 255, message = "imgUrl의 크기는 1에서 255 사이입니다.")
    private String imgUrl;

    @NotNull(message = "objectUrl은 null일 수 없습니다.")
    //@Size(min = 1, max = 255, message = "objectUrl의 크기는 1에서 255 사이입니다.")
    private String objectUrl;
}
