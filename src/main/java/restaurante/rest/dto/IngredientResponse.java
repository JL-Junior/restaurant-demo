package restaurante.rest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class IngredientResponse {
    private Integer number;
    private String name;
}
