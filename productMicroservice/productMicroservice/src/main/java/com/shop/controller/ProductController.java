package com.shop.controller;

import com.shop.dto.Product;
import com.shop.service.ProductService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v1")
public class ProductController {

   // Logger logger= LoggerFactory.getLogger(ProductController.class);

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/addProduct")
    ResponseEntity<Product> addProduct(@RequestBody @Valid Product product){
        String status=productService.addProduct(product);
        log.info("Product added status - {}",status);

        return ResponseEntity.status(HttpStatus.CREATED).body(product );
    }

    @GetMapping("/productList")
    List<Product> productList(){
        return productService.listAllProducts();
    }

    @GetMapping("/productList/{category}")
    List<Product> productCategoryList(@PathVariable String category){
        return productService.productCategoryList(category);
    }

    @GetMapping("/product/{id}")
    Product productById(@PathVariable String id){

        return productService.productById(id);
    }

    @PutMapping("/productUpdate")
    String updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);

    }

    @DeleteMapping("/product/{id}")
    String  deleteById(@PathVariable String id){

        return productService.deleteById(id);
    }

}
