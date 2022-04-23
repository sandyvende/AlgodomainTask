package com.sale.promanager.Services;

import com.sale.promanager.Entity.Product;

import java.util.List;
import java.util.Optional;

public interface CustomerServiceImpl {
    public Optional<Product> findByName(String name);
    public Optional<List<Product>> findByType(String ptype);
    public Optional<List<Product>> findByCategory(String category);
    public Optional<List<Product>> priceAmid(String min,String max);
}
