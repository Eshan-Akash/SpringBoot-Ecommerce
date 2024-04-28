package dev.eshan.productservice.repositories;

import dev.eshan.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository
        extends JpaRepository<Product, String> {
    Product findByTitleEquals(String title);

    Product findByTitleEqualsAndPrice_Price(String title, double price);

    List<Product> findDistinctByPrice_Currency(String currency);

    @Query(value = "SELECT * from product where id= :id", nativeQuery = true)
    Product getProduct(String id);

    @Query("SELECT p from Product p where p.id = :id")
    Product readProduct(String id);
}
