package co.com.wmp.Java2.service;

import co.com.wmp.Java2.domain.Products;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductService {

    Products findById(Long idProduct);
    Products findByName(String name);
    List<Products> findAll();
    Products save(Products products);
    Products update(Products products);
    void delete(Long idProduct);
}
