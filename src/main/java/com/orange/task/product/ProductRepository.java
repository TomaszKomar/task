package com.orange.task.product;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Repository
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
class ProductRepository {
    Map<String, Product> products = new ConcurrentHashMap<>();

    public Optional<Product> findById(String id) {
        return Optional.ofNullable(products.get(id));
    }

    public int count() { return products.size(); }

    public Product save(Product product) {
        if (ObjectUtils.isEmpty(product.id())) {
            var id = UUID.randomUUID().toString();
            var savedProduct = new Product(id, product.name(), product.price(), product.description());
            products.put(id, savedProduct);
            return savedProduct;
        } else {
            products.put(product.id(), product);
            return product;
        }

    }

    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }
}
