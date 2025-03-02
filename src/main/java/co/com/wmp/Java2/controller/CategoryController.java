package co.com.wmp.Java2.controller;

import co.com.wmp.Java2.domain.Category;
import co.com.wmp.Java2.service.ICategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

    private final ICategoryService categoryService;


    @GetMapping("/name/{name}")
    public ResponseEntity<Category> getCategoryByName(@PathVariable String name){
        try {
            return ResponseEntity.ok(categoryService.findByName(name));
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Category> saveCategory(@RequestBody Category category){
        try {
            return ResponseEntity.ok(categoryService.save(category));
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping()
    public ResponseEntity<List<Category>> getAllCategory(){
        try {
            return ResponseEntity.ok(categoryService.findAll());
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Category> getCategoryById (@PathVariable Long id){
        try {
            return ResponseEntity.ok(categoryService.findById(id));
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<String> deleteCategoryById(@PathVariable Long id){
        try {
            categoryService.delete(id);
            return ResponseEntity.ok("ok");
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping
    public ResponseEntity<Category> updateCategory(@RequestBody Category category){
        try {
            return ResponseEntity.ok(categoryService.update(category));
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }
}
