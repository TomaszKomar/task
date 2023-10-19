package com.orange.task.product;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    ProductRepository productRepository = new ProductRepository();

    @Test
    void save() {
        productRepository.save(new Product("1", "Apple", BigDecimal.TEN, "Test apple"));

        var savedProduct = productRepository.findById("1");

        assertTrue(savedProduct.isPresent());
        assertEquals("1", savedProduct.get().id());
        assertEquals("Apple", savedProduct.get().name());
        assertEquals(BigDecimal.TEN, savedProduct.get().price());
        assertEquals("Test apple", savedProduct.get().description());
    }
}
