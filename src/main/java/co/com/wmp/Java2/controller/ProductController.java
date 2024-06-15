package co.com.wmp.Java2.controller;

import co.com.wmp.Java2.domain.Products;
import co.com.wmp.Java2.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final IProductService productService;

    @GetMapping("/name/{name}")
    public ResponseEntity<Products> getProductsByName(@PathVariable String name){
        try {
            return ResponseEntity.ok(productService.findByName(name));
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Products> saveProducts(@RequestBody Products products){
        try {
            return ResponseEntity.ok(productService.save(products));
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping()
    public ResponseEntity<List<Products>> getAllProducts(){
        try {
            return ResponseEntity.ok(productService.findAll());
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Products> getProductsById(@PathVariable Long id){
        try {
            return ResponseEntity.ok(productService.findById(id));
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<String> deleteProductsById(@PathVariable Long id){
        try {
            productService.delete(id);
            return ResponseEntity.ok("ok");
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping
    public ResponseEntity<Products> updateProducts(@RequestBody Products products){
        try {
            return ResponseEntity.ok(productService.update(products));
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }
}
