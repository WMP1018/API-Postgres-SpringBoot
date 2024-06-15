package co.com.wmp.Java2.repository;

import co.com.wmp.Java2.domain.Category;
import co.com.wmp.Java2.domain.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository  extends JpaRepository<Products,Long> {
    Optional<Products> findByProductName(String name);
}
