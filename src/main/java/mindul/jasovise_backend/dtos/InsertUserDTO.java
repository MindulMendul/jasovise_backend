package mindul.jasovise_backend.dtos;

import jakarta.validation.constraints.NotNull;

public class InsertUserDTO {
  // @Size(min = 1, max = 16, message = "nickname의 크기는 1에서 16 사이입니다.")
  @NotNull(message = "username은 null일 수 없습니다.")
  private String username;

  //@Size(min = 1, max = 300, message = "password의 크기는 1에서 300 사이입니다.")
  @NotNull(message = "password는 null일 수 없습니다.")
  private String password;
}
