package com.example.fruitmarketbuyer3.buyer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BuyerService {
    private final BuyerRepository buyerRepository;

    @Transactional
    public void joinByNameAndPwAndEmail(BuyerRequest.JoinDTO reqDTO){
        buyerRepository.join(reqDTO);
    }

    public Buyer loginByNameAndPw(BuyerRequest.LoginDTO reqDTO){
        Buyer sesseionBuyer = buyerRepository.login(reqDTO);
        return sesseionBuyer;
    }
}
