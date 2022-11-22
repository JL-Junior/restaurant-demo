package restaurante.rest.dto;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MenuItemResponse {
    private Integer number;
    private String name;
    private String description;
    private Double price;
    private List<IngredientResponse> ingredients;
}
