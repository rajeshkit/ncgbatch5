package com.altimteriko;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.altimteriko"})
public class ApplicationBeanConfig {
    @Bean //<bean id="createString" class="java.lang.String"></bean>
    public String createString(){
        return new String();
    }
    @Bean//<bean id="product" class="com.altimetrik.Product"></bean>
    public Product product(){
        return new Product();
    }

}









