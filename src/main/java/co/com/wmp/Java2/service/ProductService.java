package co.com.wmp.Java2.service;

import co.com.wmp.Java2.domain.Products;

import java.util.List;
import java.util.Optional;

import co.com.wmp.Java2.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {

    private final ProductRepository productRepository;

    @Transactional(readOnly = true)
    @Override
    public Products findById(Long idProduct) {
        Optional<Products> productTmp = productRepository.findById(idProduct);
        if (productTmp.isPresent()){
            return productTmp.get();
        }else {
            throw new RuntimeException("Product not found " + idProduct);
        }
    }

    @Transactional(readOnly = true)
    @Override
    public Products findByName(String name) {
        Optional<Products> productTmp = productRepository.findByProductName(name);
        if (productTmp.isPresent()){
            return productTmp.get();
        }else {
            throw new RuntimeException("Product not found " + name);
        }
    }

    @Override
    public List<Products> findAll() {
        return productRepository.findAll();
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @Override
    public Products save(Products products) {
        return productRepository.save(products);
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @Override
    public Products update(Products products) {
        if (productRepository.existsById(products.getProductId())){
            return productRepository.save(products);
        } else {
            throw new RuntimeException("Product not found by ID: " + products.getProductId());
        }
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @Override
    public void delete(Long idProduct) {
        if(productRepository.existsById(idProduct)){
            productRepository.deleteById(idProduct);
        }else {
            throw new RuntimeException("Product not found " + idProduct);
        }
    }
}
