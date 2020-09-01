package guru.springframework.services;

import guru.springframework.api.v1.mapper.CustomerMapper;
import guru.springframework.api.v1.model.CustomerDTO;
import guru.springframework.domain.Customer;
import guru.springframework.repositories.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

/**
 * Created by jesussarco on 01/09/2020
 */
class CustomerServiceTest {

    CustomerService customerService;

    @Mock
    CustomerRepository customerRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        customerService = new CustomerServiceImpl(CustomerMapper.INSTANCE, customerRepository);
    }

    @Test
    void getAllCustomers() {
        //given
        List<Customer> customers = Arrays.asList(new Customer(), new Customer(), new Customer());

        when(customerRepository.findAll()).thenReturn(customers);

        //when
        List<CustomerDTO> customerDTOS = customerService.getAllCustomers();

        //then
        assertEquals(customers.size(), customerDTOS.size());
    }

    @Test
    void getCustomerById() {
        //given
        Customer customer = Customer.builder().id(1L).firstName("First Name").lastName("Last Name").build();

        when(customerRepository.findById(anyLong())).thenReturn(Optional.of(customer));

        //when
        CustomerDTO customerDTO = customerService.getCustomerById(customer.getId());

        //then
        assertEquals(customerDTO.getId(), customerDTO.getId());
        assertEquals(customerDTO.getFirstName(), customerDTO.getFirstName());
        assertEquals(customerDTO.getLastName(), customerDTO.getLastName());
    }
}