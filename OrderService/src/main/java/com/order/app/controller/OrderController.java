package com.order.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.app.payload.OrderRequest;
import com.order.app.service.IOrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private IOrderService orderService;

	// create order
	@PostMapping
	public ResponseEntity<Map<String, Object>> createOrder(@RequestBody OrderRequest request) {
		return orderService.createOrder(request);
	}

}
