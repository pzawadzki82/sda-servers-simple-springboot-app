package pl.sda.sdaserverssimplespringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//for standalone: public class SdaServersSimpleSpringbootAppApplication {
public class SdaServersSimpleSpringbootAppApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SdaServersSimpleSpringbootAppApplication.class, args);
    }

}
