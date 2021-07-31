package id.codefun.common.model.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class FindByIdRequest extends BaseRequest {

    @ApiModelProperty(value="ID to Find")
    private Long id;
    
}
