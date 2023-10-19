package com.orange.task.product;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/products")
interface ProductApi {

    @GetMapping("/{id}")
    Product getProduct(@PathVariable("id") String id);

    @GetMapping("/")
    List<Product> listProducts();

    @PostMapping("/")
    Product createProduct(@RequestBody Product product);
}
