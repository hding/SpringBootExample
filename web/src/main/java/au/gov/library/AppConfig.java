package au.gov.library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "au.gov.library")
public class AppConfig {

	@Bean
	public FreeMarkerConfigurer freemarkerConfig() {
		try {
			FreeMarkerConfigurer fm = new FreeMarkerConfigurer();
			freemarker.template.Configuration config = new freemarker.template.Configuration();
			Resource path=new DefaultResourceLoader().getResource("/WEB-INF/freemarker"); 
			config.setDirectoryForTemplateLoading(path.getFile());
			fm.setConfiguration(config);
			return fm;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Bean
	public FreeMarkerViewResolver viewResolver() {
		FreeMarkerViewResolver viewResolver = new FreeMarkerViewResolver();
		viewResolver.setCache(true);
		viewResolver.setPrefix("");
		viewResolver.setSuffix(".ftl");
		return viewResolver;
	}

}
