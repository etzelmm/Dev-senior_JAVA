package com.devsenior.students.eamolinam.catalogo_productos.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsenior.students.eamolinam.catalogo_productos.model.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    private static List<Product> products = new ArrayList<>();
    private static Long nextId = 1L;

    static {
        products.add(new Product(nextId++, "Laptop", 1200.00));
        products.add(new Product(nextId++, "Mouse", 25.00));
        products.add(new Product(nextId++, "Teclado Mecánico", 90.00));
    }

    @GetMapping
    public List<Product> getProducts(){
        return products;
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id){
        return products.stream().filter(p -> p.getId() == id).findFirst().get();
    }

    @PostMapping
    public Product newProduct(@RequestBody Product product){
        product.setId(nextId++);
        products.add(product);
        return product;
    }
}
