package com.client.graphql.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.stereotype.Component;

import com.client.graphql.dto.Item;

@Component
public class GraphQLClient {

	@Autowired
	private HttpGraphQlClient httpGraphQlClient;
	
	public List<Item> getProducts(){
		System.out.println("getProducts");
		String graphQLQuery = "query getAllProducts{\r\n"
				+ "  getAllProducts {\r\n"
				+ "    id,\r\n"
				+ "    productCode,\r\n"
				+ "    productName,\r\n"
				+ "    category\r\n"
				+ "  }\r\n"
				+ "}";
		
		return httpGraphQlClient.document(graphQLQuery).retrieve("getAllProducts").toEntityList(Item.class).block();
	}
}
