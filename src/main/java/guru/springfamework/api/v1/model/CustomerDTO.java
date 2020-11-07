package guru.springfamework.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

    @ApiModelProperty(value = "This is first name", required = true)
    private String firstname;
    @ApiModelProperty(value = "This is last name", required = true)
    private String lastname;

    @JsonProperty("customer_url")
    private String customerUrl;
}
