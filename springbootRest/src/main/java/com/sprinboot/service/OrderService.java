package com.sprinboot.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.sprinboot.dto.OrderRequestDTO;
import com.sprinboot.dto.OrderResponseDTO;

public interface OrderService {
	
	public OrderResponseDTO placeOrder(List<OrderRequestDTO> orderRequestDTO);

	public ResponseEntity<OrderResponseDTO> getOrderDetails(long orderId);

}
