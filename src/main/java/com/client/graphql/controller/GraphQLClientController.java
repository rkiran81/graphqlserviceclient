package com.client.graphql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.graphql.client.GraphQLClient;
import com.client.graphql.dto.Item;

@RestController
@RequestMapping("/graphqlclient")
public class GraphQLClientController {
	
	@Autowired
	private GraphQLClient graphQLClient;
	
	@GetMapping("/getAllProducts")
	public List<Item> getAllProducts(){
		System.out.println("/getAllProducts");
		return graphQLClient.getProducts();
	}
}
