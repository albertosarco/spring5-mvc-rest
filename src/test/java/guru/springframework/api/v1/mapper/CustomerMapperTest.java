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
                .firstName("firstName")
                .lastName("lastName")
                .customerUrl("url")
                .build();

        CustomerDTO customerDTO = customerMapper.customerToCustomerDTO(customer);

        assertEquals(customer.getId(), customerDTO.getId());
        assertEquals(customer.getFirstName(), customerDTO.getFirstName());
        assertEquals(customer.getLastName(), customerDTO.getLastName());
        assertEquals(customer.getCustomerUrl(), customerDTO.getCustomerUrl());
    }
}