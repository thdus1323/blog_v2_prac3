package com.example.fruitmarketbuyer3.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;

    //3. 상품목록구현
    public List<ProductResponse.ListDTO> getProductList(){
        List<Product> productList = productRepository.findAll();
        return productList.stream().map(ProductResponse.ListDTO::new)
                        .collect(Collectors.toList());
    }
}
