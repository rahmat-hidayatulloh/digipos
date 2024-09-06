package id.co.digipos.repository;

import id.co.digipos.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

/*    @Query("SELECT p.product_code, p.name, p,active_flag FROM PRODUCT p " +
            "WHERE p.active_flag = 1 " +
            "ORDER BY p.created_at ASC")
    Product findByProductCode(String productCode);*/
}
