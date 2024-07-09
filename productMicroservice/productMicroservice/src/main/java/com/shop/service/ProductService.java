package com.shop.service;

import com.shop.dto.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>();

    public String addProduct(Product product) {
        products.add(product);
        return "success";
    }

    public List<Product> listAllProducts() {
        return products;
    }

    public List<Product> productCategoryList(String category) {
        return products.stream()
                .filter(product -> product.getCategory().getName().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public Product productById(int id) {
        return products.stream()
                .filter(product -> product.getId()==id)
                .findAny()
                .get();

    }

    public String updateProduct(Product product) {
        for(Product prod : products){
            if(prod.getId()==product.getId()){
                prod.setName(product.getName());
                prod.setDiscount(product.getDiscount());
                prod.setCategory(product.getCategory());
                prod.setDiscountDescription(product.getDiscountDescription());

                return "product updated successfully";
            }
        }
        return "product update failed";
    }

    public String deleteById(int id) {
        for(Product product:products){
            if(product.getId()==id){
                products.remove(product);
                return "product deleted successfully";
            }
        }
        return "product deletion failed";
    }
}
