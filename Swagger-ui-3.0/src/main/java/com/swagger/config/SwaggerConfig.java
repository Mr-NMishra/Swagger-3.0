package com.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.groupName("Swagger-ui Demo")
				.select().paths(regex("/api/swagger/.*"))
				.build();
				
				
				
	}
	
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Swagger 3.0")
				.description("Swagger 3.0 implementation with spring boot")
				.license("License to Narendra Mishra")
				.version("1.0 beta")
				.contact(new Contact("Narendra Mishra", "https://google.com", "mishra.narendra003@gmail.com"))
				.build();
	}

}
