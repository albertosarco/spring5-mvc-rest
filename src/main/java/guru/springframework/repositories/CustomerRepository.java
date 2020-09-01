package guru.springframework.repositories;

import guru.springframework.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jesussarco on 01/09/2020
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
