package kh.esprit.tpjpaentity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
 
/**
 * @author MrJava
 *
 * 17 Mar 2022
 */

@EnableScheduling
@EnableSwagger2
@EnableWebMvc
@SpringBootApplication
public class TpJpaEntityApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpJpaEntityApplication.class, args);
	}

}
