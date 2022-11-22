package restaurante.rest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ErrorMessageResponse {
    private Integer id;
    private String description;
}
