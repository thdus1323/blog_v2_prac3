package com.example.fruitmarketbuyer3.buyer;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@NoArgsConstructor
@Data
@Table(name = "buyer_tb")
@Entity
public class Buyer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer buyerId;

    @Column(unique = true, nullable = false)
    private String buyerName;

    @Column(nullable = false)
    private String buyerPw;

    @Column(nullable = false)
    private String buyerEmail;

    @CreationTimestamp
    private LocalDate createdAt;

    @Builder
    public Buyer(Integer buyerId, String buyerName, String buyerPw, String buyerEmail, LocalDate createdAt) {
        this.buyerId = buyerId;
        this.buyerName = buyerName;
        this.buyerPw = buyerPw;
        this.buyerEmail = buyerEmail;
        this.createdAt = createdAt;
    }
}
