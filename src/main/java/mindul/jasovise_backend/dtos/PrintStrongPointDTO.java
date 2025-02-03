package mindul.jasovise_backend.dtos;

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
public class PrintStrongPointDTO {

    private int itemNum;

    private String memberThumbImgUrl;

    private String catCode;

    private String title;

    private String imgUrl;

    private String tokenUri;

    private String stateCode;

    private double price;

}