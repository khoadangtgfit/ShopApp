package com.example.ShopApp.controller;

import com.example.ShopApp.dtos.OrderDTO;
import com.example.ShopApp.dtos.OrderDetailDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${api.prefix}/order_details")
@Validated
public class OrderDetailController {

    @GetMapping("/{id}")
    public ResponseEntity<?> getOrderDetail(@Valid @PathVariable("id") Long id){
        return ResponseEntity.ok("get Order detail with id = "+ id);
    }

    @GetMapping("/order/{orderId}")
    public ResponseEntity<?> getOrderDetails(@Valid @PathVariable("orderId") Long orderId){
        return ResponseEntity.ok("get Order detail with orderId = "+ orderId);

    }

    @PostMapping("/{id}")
    public ResponseEntity<?> updateOrderDetails(@Valid @PathVariable("id") Long id, @RequestBody OrderDetailDTO orderDetailDTO){
        return ResponseEntity.ok("update order detail with id = "+id+"new order detail = "+orderDetailDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteOrderDetails(@Valid @PathVariable("id") Long id){
        return ResponseEntity.noContent().build();
    }


}
