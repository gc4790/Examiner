package appInitilizer;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    
    public static void main(String[] args) {
    	SpringApplication  ctx = new SpringApplication(Application.class);
        ctx.setDefaultProperties(Collections
                .singletonMap("server.port", "8083"));
        ctx.run();
        System.out.println("Let's inspect the beans provided by Spring Boot:");
        
    }

}
