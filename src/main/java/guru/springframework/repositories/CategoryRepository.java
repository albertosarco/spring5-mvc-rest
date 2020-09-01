package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jesussarco on 31/08/2020
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);
}
