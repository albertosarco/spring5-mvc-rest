package guru.springframework.controllers.v1;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by jesussarco on 02/09/2020
 */
public abstract class AbstractRestControllerTest {

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
