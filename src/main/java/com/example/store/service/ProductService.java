package com.example.store.service;

import com.example.store.model.Product;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductService {
    private final Map<Long, Product> store = new ConcurrentHashMap<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    public List<Product> getAll() {
        return new ArrayList<>(store.values());
    }

    public Product getById(Long id) {
        return store.get(id);
    }

    public Product create(Product product) {
        if (product.getName() == null || product.getName().isBlank()) {
            throw new IllegalArgumentException("Product name is required");
        }
        if (product.getPrice() < 0) {
            throw new IllegalArgumentException("Price must be >= 0");
        }
        Long id = idCounter.getAndIncrement();
        product.setId(id);
        store.put(id, product);
        return product;
    }

    public Product update(Long id, Product details) {
        Product existing = store.get(id);
        if (existing == null) return null;

        // Replace fields (you can make this merge/partial update if you want)
        existing.setName(details.getName());
        existing.setPrice(details.getPrice());
        existing.setQuantity(details.getQuantity());
        store.put(id, existing);
        return existing;
    }

    public boolean delete(Long id) {
        return store.remove(id) != null;
    }

    public void clearAll() {
        store.clear();
        idCounter.set(1);
    }
}
