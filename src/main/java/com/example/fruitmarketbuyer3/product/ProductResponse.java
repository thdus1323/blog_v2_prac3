package com.example.fruitmarketbuyer3.product;

import lombok.Data;

public class ProductResponse {

    @Data
    public static class ListDTO{
        private Integer productId;
        private String productName;
        private Integer productPrice;
        private Integer productQty;

        public ListDTO(Product product) {
            this.productId = product.getProductId();
            this.productName = product.getProductName();
            this.productPrice = product.getProductPrice();
            this.productQty = product.getProductQty();
        }
    }
}
