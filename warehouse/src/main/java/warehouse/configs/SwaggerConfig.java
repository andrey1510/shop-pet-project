package warehouse.configs;

import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;


public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI(@Value("${springdoc.version}") String appVersion) {
        return new OpenAPI().info(new Info().title("test API")
                .version(appVersion)
                .description("test Swagger.")
                .termsOfService("http://swagger.io/terms/")
                .contact(new Contact()
                        .name("test")
                        .email("test@test.ru")
                        .url("test"))
                .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }
}
