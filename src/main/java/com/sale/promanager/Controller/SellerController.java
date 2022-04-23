package com.sale.promanager.Controller;

import com.sale.promanager.Entity.Product;
import com.sale.promanager.Services.SellerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SellerController {
   @Autowired
    private SellerServiceImpl sellerService;
    @PostMapping("/AddProduct")
    public Product addProduct(@RequestBody Product product)
    {
        sellerService.saveProduct(product);
       return product;
    }
    @PostMapping("/findAllProduct")
    public List<Product> findAll()
    {
        return sellerService.findAllProducts();
    }
    @PostMapping("/removeProduct")
    public String removeProduct(@RequestParam Long id)
    {
        sellerService.removeProduct(id);
        return "Product Removed with Id";
    }
    @PostMapping("/saveAllProducts")
    public List<Product> removeProduct(@RequestBody List<Product> productList)
    {
         return sellerService.saveAllProduct(productList);
    }
    @PutMapping("/updateProduct")
    public String  updateProduct(@RequestBody Product product)
    {
     String result= sellerService.updateProduct(product);
     return result;
    }
}
