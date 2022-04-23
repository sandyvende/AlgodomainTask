package com.sale.promanager.Repository;

import com.sale.promanager.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query(nativeQuery = true,value = "select * from Product prod where prod.name= :product_name")
    public Optional<Product> findByName(String product_name);

    @Query(nativeQuery = true,value = "select * from product prod where prod.type= :product_type")
    public Optional<List<Product>> findByType(String product_type);

    @Query(nativeQuery = true,value = "select * from product prod where prod.category= :product_category")
    public Optional<List<Product>> findByCategory(String product_category);

    @Query(nativeQuery = true,value = "select * from product prod where prod.price BETWEEN :min AND :max")
    public Optional<List<Product>> priceAmid(String  min,String max);

}
