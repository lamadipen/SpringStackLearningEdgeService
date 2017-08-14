package com.dipen.radius.Radius;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.dipen.radius.Radius.prefilter.SimpleFilter;

@EnableZuulProxy
@SpringBootApplication
public class RadiusGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RadiusGatewayApplication.class, args);
	}
	
	@Bean
	public SimpleFilter simpleFilter()
	{
		return new SimpleFilter();
	}
}
