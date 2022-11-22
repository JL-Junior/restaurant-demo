package restaurante.rest.dto;

import java.util.UUID;

import org.jboss.resteasy.reactive.RestHeader;
import org.jboss.resteasy.reactive.RestQuery;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import restaurante.rest.constants.HeaderConstants;
import restaurante.rest.constants.QueryParamConstants;

@Getter
@Setter
@Builder
public class MenuRequest {
    @RestHeader(HeaderConstants.HEADER_SHOP_NUMBER) UUID shopId;
    @RestQuery(QueryParamConstants.MENU_ITEM_NAME) String itemName;
}
