package guru.springframework.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by jesussarco on 01/09/2020
 */
@Data
public class CustomerDTO {

    private Long id;
    private String firstName;
    private String lastName;

    @JsonProperty("customer_url")
    private String customerUrl;

    public String getCustomerUrl() {
        return "/api/v1/customers/" + id;
    }
}
