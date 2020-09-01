package guru.springframework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by jesussarco on 01/09/2020
 */
@Data
public class CustomerDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String customerUrl;
}
