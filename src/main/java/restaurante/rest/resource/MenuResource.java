package restaurante.rest.resource;

import io.vertx.mutiny.redis.client.Response;
import restaurante.rest.api.MenuApi;
import restaurante.rest.dto.MenuRequest;

public class MenuResource implements MenuApi{

    @Override
    public Response getMenu(MenuRequest menuRequest) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
