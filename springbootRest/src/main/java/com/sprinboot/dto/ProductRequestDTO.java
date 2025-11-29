package com.sprinboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestDTO {
	
	private String productName;
	private double price;
	private double discount;
	private int stock;
}
