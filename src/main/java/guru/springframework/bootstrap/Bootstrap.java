package guru.springframework.bootstrap;

import guru.springframework.domain.Category;
import guru.springframework.repositories.CategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by jesussarco on 31/08/2020
 */
@Slf4j
@Component
public class Bootstrap implements CommandLineRunner {

    private final CategoryRepository categoryRepository;

    public Bootstrap(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        categoryRepository.save(Category.builder().name("Fruits").build());
        categoryRepository.save(Category.builder().name("Dried").build());
        categoryRepository.save(Category.builder().name("Fresh").build());
        categoryRepository.save(Category.builder().name("Exotic").build());
        categoryRepository.save(Category.builder().name("Nuts").build());

        System.out.println("Categories Added");
    }
}
