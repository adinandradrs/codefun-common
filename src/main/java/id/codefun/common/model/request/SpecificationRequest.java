package id.codefun.common.model.request;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SpecificationRequest extends BaseRequest {

    @ApiModelProperty(value="JPA Specification")
    private Specification specification;
    
    @ApiModelProperty(value="JPA Pageable")
    private transient Pageable pageable;
    
}
