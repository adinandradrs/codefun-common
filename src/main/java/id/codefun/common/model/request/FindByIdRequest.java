package id.codefun.common.model.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FindByIdRequest extends BaseRequest {

    @ApiModelProperty(value="ID to Find")
    private Long id;
    
}
