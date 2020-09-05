package guru.springframework.services;

import guru.springframework.api.v1.model.CustomerDTO;

import java.util.List;

/**
 * Created by jesussarco on 01/09/2020
 */
public interface CustomerService {

    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerById(Long id);

    CustomerDTO createNewCustomer(CustomerDTO customerDTO);
}
