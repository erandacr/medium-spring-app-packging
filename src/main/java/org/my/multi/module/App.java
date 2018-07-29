package org.my.multi.module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.my.multi.module.one.*","org.my.multi.module.two.*"})
public class App extends SpringBootServletInitializer {
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
