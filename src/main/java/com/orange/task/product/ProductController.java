package com.orange.task.product;

import com.orange.task.common.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
class ProductController implements ProductApi {

    ProductService productService;

    @Override
    public Product getProduct(String id) {
        return productService.findById(id)
                .orElseThrow(() -> new NotFoundException("6dbb533a-f2bb", String.format("Product %s not found", id)));
    }

    @Override
    public List<Product> listProducts() {
        return productService.findAll();
    }

    @Override
    public Product createProduct(Product product) {
        // TODO 3 add createProduct, should be usable only by logged in user
        return null;
    }


}
