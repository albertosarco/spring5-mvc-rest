package guru.springframework.controllers.v1;

import guru.springframework.api.v1.model.CategoryDTO;
import guru.springframework.api.v1.model.CategoryListDTO;
import guru.springframework.services.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by jesussarco on 01/09/2020
 */
@Controller
@RequestMapping("api/v1/categories/")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<CategoryListDTO> getAllCategories() {
        return ResponseEntity.ok(new CategoryListDTO(categoryService.getAllCategories()));
    }

    @GetMapping("{name}")
    public ResponseEntity<CategoryDTO> getCategoryByName(@PathVariable String name) {
        return ResponseEntity.of(Optional.ofNullable(categoryService.getCategoryByName(name)));
    }
}
