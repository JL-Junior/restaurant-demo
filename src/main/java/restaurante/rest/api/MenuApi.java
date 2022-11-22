package restaurante.rest.api;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import io.vertx.mutiny.redis.client.Response;
import restaurante.rest.constants.Tags;
import restaurante.rest.dto.ErrorResponse;
import restaurante.rest.dto.MenuItemResponse;
import restaurante.rest.dto.MenuRequest;

@Path("menu")
public interface MenuApi {

    @GET
    @Tag(name = Tags.MENU)
    @APIResponse(responseCode = "200", description = "OK", content = @Content(mediaType = MediaType.APPLICATION_JSON, schema = @Schema(implementation = MenuItemResponse.class, type = SchemaType.ARRAY)), name = "Get menu itens")
    @APIResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = MediaType.APPLICATION_JSON, schema = @Schema(implementation = ErrorResponse.class, type = SchemaType.OBJECT)), name = "Get menu itens")
    Response getMenu(@BeanParam MenuRequest menuRequest);
}
