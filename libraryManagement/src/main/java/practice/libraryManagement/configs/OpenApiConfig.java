package practice.libraryManagement.configs;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI defineOpenApi() {
        // Define server information
        Server server = new Server();
        server.setUrl("http://localhost:8080/api");
        server.setDescription("Development Server");

        // Define contact information
        Contact contact = new Contact();
        contact.setName("Library API Support");
        contact.setEmail("support@libraryapi.com");

        // Define API info
        Info apiInfo = new Info()
                .title("Library Management System API")
                .version("1.0")
                .description("This API provides endpoints to manage books and authors.")
                .contact(contact);

        // Return the OpenAPI configuration
        return new OpenAPI().info(apiInfo).servers(List.of(server));
    }
}
