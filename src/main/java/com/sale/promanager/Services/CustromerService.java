package com.sale.promanager.Services;

import com.sale.promanager.Entity.Product;
import com.sale.promanager.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustromerService implements CustomerServiceImpl{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Optional<Product> findByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public Optional<List<Product>> findByType(String ptype) {
        return productRepository.findByType(ptype);
    }

    @Override
    public Optional<List<Product>> findByCategory(String category) {
      return productRepository.findByCategory(category);
    }

    @Override
    public Optional<List<Product>> priceAmid(String min, String max) {
        return productRepository.priceAmid(min,max);
    }

}
