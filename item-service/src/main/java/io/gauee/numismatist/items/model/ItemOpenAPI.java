package io.gauee.numismatist.items.model;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;

public class ItemOpenAPI {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Numismatist Items API")
                        .description("Numismatist items service")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0").url("http://gauee.io")))
                .externalDocs(new ExternalDocumentation()
                        .description("Numismatist Items Wiki Docs")
                        .url("https://github.com/gauee/numismatist"));
    }
}
