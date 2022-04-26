package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }



    @GetMapping("/products")
    public List<Product> getCategories(Model model) {
        return productService.getProducts();
    }


    @PostMapping("/addProduct")
    public void addCategory(@RequestBody Product product) {
        productService.addProduct(product);
    }

}
