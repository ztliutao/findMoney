package com.wallet.findMoneyApp.swagger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@ConditionalOnProperty(prefix = "swagger",value = {"enable"},havingValue = "true")
@EnableSwagger2
public class Swagger2 {


    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(
                RequestHandlerSelectors.basePackage("com.wallet.findMoneyApp.controller")
        )
                .paths(PathSelectors.any())
                .build();


    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("钱包文档").description("前端服务文档")
                .termsOfServiceUrl("http://192.168.1.5").licenseUrl("/v2").version("1.0").build();
    }
}
