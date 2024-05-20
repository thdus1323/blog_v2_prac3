package com.example.fruitmarketbuyer3.buyer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class BuyerRepository {
    private final EntityManager em;

    public void join(BuyerRequest.JoinDTO reqDTO) {
        String q = """
                insert into buyer_tb(buyer_name, buyer_pw, buyer_email, created_at) values (?,?,?,now())
                """;
        Query query = em.createNativeQuery(q);
        query.setParameter(1, reqDTO.getBuyerName());
        query.setParameter(2, reqDTO.getBuyerPw());
        query.setParameter(3, reqDTO.getBuyerEmail());
        query.executeUpdate();
    }
}
