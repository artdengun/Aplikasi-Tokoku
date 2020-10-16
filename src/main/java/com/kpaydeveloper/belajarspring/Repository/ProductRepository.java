package com.kpaydeveloper.belajarspring.Repository;


import com.kpaydeveloper.belajarspring.Dao.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {

//Iterable<Product> findByVendor();

}
