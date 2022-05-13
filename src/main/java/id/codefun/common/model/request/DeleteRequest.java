package id.codefun.common.model.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeleteRequest extends BaseRequest {

    @ApiModelProperty(value="ID to Delete")
    private Long id;

    @JsonIgnore
    private Long loggerUserId;

    @JsonIgnore
    private String loggedUser;
}
