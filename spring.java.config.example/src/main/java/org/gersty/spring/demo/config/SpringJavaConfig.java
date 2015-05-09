package org.gersty.spring.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"org.gersty.spring.demo"})
@EnableWebMvc
public class SpringJavaConfig {

}
