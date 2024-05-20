package com.example.fruitmarketbuyer3.product;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@NoArgsConstructor
@Entity
@Data
@Table(name = "product_tb")
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer productId;

    @Column(unique = true,length = 20, nullable = false)
    private String productName;

    @Column(nullable = false)
    private Integer productPrice;

    @Column(nullable = false)
    private Integer productQty;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
