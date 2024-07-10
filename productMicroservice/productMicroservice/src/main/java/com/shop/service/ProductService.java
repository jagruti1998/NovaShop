package com.shop.service;

import com.shop.config.ProductConfiguration;
import com.shop.dto.Product;
import com.shop.exception.CurrencyNotValidException;
import com.shop.exception.OfferNotValidException;
import com.shop.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Slf4j
@Service
public class ProductService {

    private ProductRepository productRepository;

    private ProductConfiguration productConfiguration;

    public String addProduct(Product product) {
        log.info("adding product");
        if(product.getPrice()==0 && product.getDiscount()>0){
            throw new OfferNotValidException(" No discount is allowed at 0 product price");
        }


        if(!productConfiguration.getCurrencies().contains(product.getCurrency().toUpperCase())){
            throw new CurrencyNotValidException("Invalid currency. Valid currencies " +productConfiguration.getCurrencies());
        }
        productRepository.save(product);
        return "success";
    }

    public List<Product> listAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> productCategoryList(String category) {
        return productRepository.findByCategory(category);
    }

    public Product productById(String id) {
        return productRepository.findById(id).get();

    }

    public String updateProduct(Product product) {
                productRepository.save(product);
                return "product updated successfully";

    }

    public String deleteById(String id) {
        productRepository.deleteById(id);
        return "product deleted";
    }
}
