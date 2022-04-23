package com.sale.promanager.Controller;

import com.sale.promanager.Entity.Product;
import com.sale.promanager.Repository.ProductRepository;
import com.sale.promanager.Services.CustomerServiceImpl;
import com.sale.promanager.Services.SellerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/custapi")
public class CustomerController {
   @Autowired
   private CustomerServiceImpl customerService;
    @GetMapping("/findByName/{pname}")
    public Optional<Product> findByName(@PathVariable String pname)
    {
          return customerService.findByName(pname);
    }
    @GetMapping("/findByType/{ptype}")
    public Optional<List<Product>> findByType(@PathVariable String ptype)
    {
        return customerService.findByType(ptype);
    }
    @GetMapping("/findByType/{category}")
    public Optional<List<Product>> findByCategory(@PathVariable String category)
    {
        return customerService.findByCategory(category);
    }
    @GetMapping("/PriceAmid")
    public Optional<List<Product>> priceAmid(@RequestParam String min,@RequestParam String max )
    {
        System.out.println(min);
        System.out.println(max);
        return customerService.priceAmid(min,max);
    }
}
