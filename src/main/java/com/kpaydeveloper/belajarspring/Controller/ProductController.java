package com.kpaydeveloper.belajarspring.Controller;


import com.kpaydeveloper.belajarspring.Dao.Product;
import com.kpaydeveloper.belajarspring.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public Iterable<Product> findAllProduct(){
      return  productRepository.findAll();
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public Optional<Product>  findById(@PathVariable Long id)
    {
        return productRepository.findById(id);
    }
}
