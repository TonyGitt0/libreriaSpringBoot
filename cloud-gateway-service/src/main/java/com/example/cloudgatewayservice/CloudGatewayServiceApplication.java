package com.example.cloudgatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import filter.SimpleFilter;

@PropertySources({  
	@PropertySource(value= "file:${catalina.home}/conf/configurazioni/cloud-gateway-service/application.properties")
})
@SpringBootApplication
@EnableZuulProxy
public class CloudGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayServiceApplication.class, args);
	}
	
	@Bean
	public SimpleFilter filter() {
		return new SimpleFilter();
	}

}
