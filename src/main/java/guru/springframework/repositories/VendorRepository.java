package guru.springframework.repositories;

import guru.springframework.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jesussarco on 06/09/2020
 */
public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
