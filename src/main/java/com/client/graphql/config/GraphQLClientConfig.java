package com.client.graphql.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class GraphQLClientConfig {
	
	@Bean
	public WebClient webClient() {
		return WebClient.builder().baseUrl("http://localhost:8080/graphql").build();
	}
	
	@Bean
	public HttpGraphQlClient httpGraphQlClient() {
		return HttpGraphQlClient.builder(webClient()).build();
	}
}
