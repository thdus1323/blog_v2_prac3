package com.example.fruitmarketbuyer3.product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class ProductRepository {
    private final EntityManager em;

    //3. 상품구현
    public List<Product> findAll(){
        Query query = em.createNativeQuery("select * from product_tb order by product_id desc", Product.class);
        return query.getResultList();


    }

}
