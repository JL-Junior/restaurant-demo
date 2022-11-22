package restaurante.rest.api;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import restaurante.rest.constants.Tags;

import javax.ws.rs.core.Application;

@OpenAPIDefinition(
    tags = { 
        @Tag(name = Tags.MENU, description = "menu operations")
    }, //
    info = @Info(//
        title = "Api do restaurante", //
        version = "1.0.0", //
        contact = @Contact(//
            name = "Fale com o desenvolvedor", //
            url = "https://github.com/JL-Junior")), //
    servers = { //
        @Server(url = "http://localhost:8080")//
    }) //
public class ApiDefinitions extends Application{
}
