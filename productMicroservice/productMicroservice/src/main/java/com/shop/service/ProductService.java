package com.shop.service;

import com.shop.dto.Product;
import com.shop.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public String addProduct(Product product) {
        productRepository.save(product);
        return "success";
    }

    public List<Product> listAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> productCategoryList(String category) {
        return productRepository.findByCategory(category);
    }

    public Product productById(int id) {
        return productRepository.findById(id).get();

    }

    public String updateProduct(Product product) {
                productRepository.save(product);
                return "product updated successfully";

    }

    public String deleteById(int id) {
        productRepository.deleteById(id);
        return "product deleted";
    }
}
