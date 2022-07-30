package br.com.api.restful.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {
	
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("RESTful API with Java 17 and Spring Boot 3")
						.version("v1")
						.description("Some description about your API.")
						.termsOfService("http://localhost:8080/termsOfService")
						.license(new License().name("Apache 2.0")
								.url("http://localhost:8080/license")
								)
						);
	}
	
	//http://localhost:8080/v3/api-docs
	//http://localhost:8080/swagger-ui/index.html
	
	//DOC -> https://lankydan.dev/documenting-a-spring-rest-api-following-the-openapi-specification
}
