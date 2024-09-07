package id.co.digipos.configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {

    public OpenAPI customOpenApi(){
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("Digipos Api")
                        .description("Digital Point Of Sales, With Java Spring boot ")
                        .contact(new Contact()
                                .name("Rahmat Hidayatulloh")
                                .url("https://github.com/rahmat-hidayatulloh")
                        )
                );
    }
}
