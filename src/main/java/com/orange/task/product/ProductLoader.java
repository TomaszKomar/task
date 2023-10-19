package com.orange.task.product;


import lombok.AllArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;

import java.math.BigDecimal;

@Configuration
@Profile("!test")
@AllArgsConstructor
class ProductLoader {
    ProductRepository productRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void initializeProducts() {
        if (productRepository.count() > 0) {
            return;
        }
        productRepository.save(new Product(null, "Apple", BigDecimal.valueOf(10.0), "Sweet and crunchy, best choice for a healthy dessert!"));
        productRepository.save(new Product(null, "Banana", BigDecimal.valueOf(15.0), "Nature's sweet energy boost!"));
        productRepository.save(new Product(null, "Pear", BigDecimal.valueOf(10.0), "Perfectly ripe refreshment!"));
        productRepository.save(new Product(null, "Mango", BigDecimal.valueOf(10.0), "Mouthwatering mangoes: Tropical delight!"));
    }
}
