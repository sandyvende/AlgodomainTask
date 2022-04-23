package com.sale.promanager.Services;

import com.sale.promanager.Entity.Product;
import com.sale.promanager.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class SellerService implements SellerServiceImpl{
@Autowired
   private ProductRepository productRepository;
    @Override
    public Product saveProduct(Product product) {
        productRepository.save(product);
        return product;
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public String removeProduct(Long id) {
        productRepository.deleteById(id);
        return "Product Removed with Id" + Long.toString(id);
    }


    @Override
    public List<Product> saveAllProduct(List<Product> productlist) {
     return productRepository.saveAll(productlist);
    }

    @Override
    public String updateProduct(Product product) {
        Long id = product.getId();
        if(productRepository.existsById(id)==true)
        {
          productRepository.save(product);
          return "Updated successfully";
        }else
        {
            return "Id invalid";
        }

    }


}
