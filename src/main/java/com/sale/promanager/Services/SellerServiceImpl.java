package com.sale.promanager.Services;

import com.sale.promanager.Entity.Product;

import java.util.List;

public interface SellerServiceImpl {
    public Product saveProduct(Product product);
    public List<Product> findAllProducts();
    public String removeProduct(Long id);
    public List<Product> saveAllProduct(List<Product> product);
    public String  updateProduct(Product product);
}
