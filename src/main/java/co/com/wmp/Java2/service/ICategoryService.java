package co.com.wmp.Java2.service;

import co.com.wmp.Java2.domain.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICategoryService {

    Category findById(Long idCategory);
    Category findByName(String name);
    List<Category> findAll();
    Category save(Category category);
    Category update(Category category);
    void delete(Long idCategory);

}
