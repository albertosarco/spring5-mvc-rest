package guru.springframework.bootstrap;

import guru.springframework.domain.Category;
import guru.springframework.domain.Customer;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.CustomerRepository;
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
    private final CustomerRepository customerRepository;

    public Bootstrap(CategoryRepository categoryRepository, CustomerRepository customerRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        categoryRepository.save(Category.builder().name("Fruits").build());
        categoryRepository.save(Category.builder().name("Dried").build());
        categoryRepository.save(Category.builder().name("Fresh").build());
        categoryRepository.save(Category.builder().name("Exotic").build());
        categoryRepository.save(Category.builder().name("Nuts").build());

        System.out.println("Categories Added");

        customerRepository.save(Customer.builder().id(1L).firstName("First name 1").lastName("Last Name 1").build());
        customerRepository.save(Customer.builder().id(2L).firstName("First name 2").lastName("Last Name 2").build());
        customerRepository.save(Customer.builder().id(3L).firstName("First name 3").lastName("Last Name 3").build());
        customerRepository.save(Customer.builder().id(4L).firstName("First name 4").lastName("Last Name 4").build());
        customerRepository.save(Customer.builder().id(5L).firstName("First name 5").lastName("Last Name 5").build());

        System.out.println("Customers Added");
    }
}
