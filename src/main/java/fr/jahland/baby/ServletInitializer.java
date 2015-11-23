package fr.jahland.baby;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(GlobalSecurityConfiguration.class, BabyServerConfiguration.class, BabyServerApplication.class);
	}

}
