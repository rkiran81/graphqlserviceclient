package com.client.graphql.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
	private int id;
	private String productCode;
	private String productName;
	private String category;
//	private double price;
//	private int stock;
}
