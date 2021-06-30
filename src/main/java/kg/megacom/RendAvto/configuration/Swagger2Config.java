package kg.megacom.RendAvto.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

}

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.metrics.StartupStep;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.service.Tag;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import static org.apache.naming.ResourceRef.AUTH;
//
//@Configuration
//@EnableSwagger2
//public class Swagger2Config {
//
//    public static final String Car = "";
//    public static final String QUERY = "";
//    public static final String PROMOTER = "";
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2).select()
//                .apis(RequestHandlerSelectors
//                        .basePackage("kg.megacom.RendAuto.controllers"))
//                .paths(PathSelectors.any())
//                .build().apiInfo(apiEndPointsInfo())
//                .tags(new Tag(Car, ""))
//                .tags(new Tag(QUERY, ""))
//                .tags(new Tag(PROMOTER, ""));
//    }
//
//    private ApiInfo apiEndPointsInfo() {
//        return new ApiInfoBuilder().title("СКПП 525 Промоутер")
//                .description("Бэкенд для мобильного приложения для Промоутеров")
//                .version("1.0.0")
//                .contact(new Contact("Джаилов Батырхан", "http://www.megacom.kg", "bduyshonbek@megacom.kg"))
//                .build();
//    }
//}
