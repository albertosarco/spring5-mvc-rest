package guru.springframework.api.v1.mapper;

import guru.springframework.api.v1.model.CustomerDTO;
import guru.springframework.domain.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jesussarco on 01/09/2020
 */
class CustomerMapperTest {

    CustomerMapper customerMapper;

    @BeforeEach
    void setUp() {
        customerMapper = CustomerMapper.INSTANCE;
    }

    @Test
    void customerToCustomerDTO() {
        Customer customer = Customer.builder()
                .id(1L)
                .firstname("firstName")
                .lastname("lastName")
                .build();

        CustomerDTO customerDTO = customerMapper.customerToCustomerDTO(customer);

        assertEquals(customer.getId(), customerDTO.getId());
        assertEquals(customer.getFirstname(), customerDTO.getFirstname());
        assertEquals(customer.getLastname(), customerDTO.getLastname());
        assertEquals("/api/v1/customers/" + customer.getId(), customerDTO.getCustomerUrl());
    }
}