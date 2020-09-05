package guru.springframework.controllers.v1;

import guru.springframework.api.v1.model.CustomerDTO;
import guru.springframework.api.v1.model.CustomerListDTO;
import guru.springframework.services.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Optional;

/**
 * Created by jesussarco on 01/09/2020
 */
@Controller
@RequestMapping("/api/v1/customers/")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<CustomerListDTO> getAllCustomers() {
        return ResponseEntity.ok(new CustomerListDTO(customerService.getAllCustomers()));
    }

    @GetMapping("{id}")
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable Long id) {
        return ResponseEntity.of(Optional.ofNullable(customerService.getCustomerById(id)));
    }

    @PostMapping
    public ResponseEntity<CustomerDTO> createNewCustomer(@RequestBody CustomerDTO customerDTO){
        CustomerDTO savedCustomerDTO = customerService.createNewCustomer(customerDTO);

        return ResponseEntity.created(URI.create(savedCustomerDTO.getCustomerUrl()))
                .body(savedCustomerDTO);
    }
}
