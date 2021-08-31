package capgemini.emp_asset.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();
	}

	private Predicate<String> postPaths() {
		return PathSelectors.any();
	}

	@SuppressWarnings("deprecation")
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Employee Asset Management System")
				.description("Team No. - 07")
				.termsOfServiceUrl("http://godknows.com")
				.contact("Rutuja Chougale,"+"\n"
						+ "Vaishnavi Chakorkar,"+"\n"
						+ "Shrishti Sharma").license("My License")
				.licenseUrl("chougalerutuja09@gmail.com").version("1.0").build();
	}

}