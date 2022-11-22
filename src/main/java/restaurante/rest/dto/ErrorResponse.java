package restaurante.rest.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ErrorResponse {
    private Integer code;
    private LocalDateTime timestamp;
    private List<ErrorMessageResponse> errors; 
}
