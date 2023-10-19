package com.orange.task.product;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {
    ProductService productService = new ProductService(new ProductRepository());

    @Test
    void shouldReturnNoProductsWithNoSavedProducts() {
        assertEquals(0, productService.findAll().size());
    }


}
