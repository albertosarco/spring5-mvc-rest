package guru.springframework.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import guru.springframework.controllers.v1.CustomerController;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by jesussarco on 01/09/2020
 */
@Data
public class CustomerDTO {

    private Long id;

    @ApiModelProperty(value = "This is the first name", required = true)
    private String firstname;

    @ApiModelProperty(required = true )
    private String lastname;

    @JsonProperty("customer_url")
    private String customerUrl;

    public String getCustomerUrl() {
        return CustomerController.BASE_URL + "/" + id;
    }
}
