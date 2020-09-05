package guru.springframework.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import guru.springframework.controllers.v1.CustomerController;
import lombok.Data;

/**
 * Created by jesussarco on 01/09/2020
 */
@Data
public class CustomerDTO {

    private Long id;
    private String firstname;
    private String lastname;

    @JsonProperty("customer_url")
    private String customerUrl;

    public String getCustomerUrl() {
        return CustomerController.BASE_URL + "/" + id;
    }
}
