package com.example.ShopApp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailDTO {
    @JsonProperty("order_id")
    @Min(value = 1, message = "Order Id must be > 0")
    private Long orderId;

    @JsonProperty("product_id ")
    @Min(value = 1, message = "Order Id must be > 0")
    private Long productId;

    @Min(value = 0, message = "Order Id must be >= 0")
    private Long price;

    @JsonProperty("number_of_products")
    @Min(value = 1, message = "Order Id must be > 0")
    private int numberOfProduct;

    @Min(value = 0, message = "Order Id must be >= 0")
    @JsonProperty("total_money")
    private int totalMoney;

    private String color;
}
