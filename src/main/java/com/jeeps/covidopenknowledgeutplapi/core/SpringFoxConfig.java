package com.jeeps.covidopenknowledgeutplapi.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.PathProvider;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@Configuration
@EnableSwagger2WebMvc
@Import(SpringDataRestConfiguration.class)
public class SpringFoxConfig {
    @Value("${server.servlet.context-path}")
    private String contextPath;

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/covidOpenKnowledge/api/v1/**"))
                .build()
                .pathProvider(new PathProvider() {
                    @Override
                    public String getOperationPath(String operationPath) {
                        return operationPath.replace(contextPath, "");
                    }

                    @Override
                    public String getResourceListingPath(String groupName, String apiDeclaration) {
                        return null;
                    }
                });
    }
}
