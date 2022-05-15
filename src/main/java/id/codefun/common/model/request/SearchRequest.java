package id.codefun.common.model.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class SearchRequest extends BaseRequest {
    
    @ApiModelProperty(value="Common Text Search")
    private String textSearch;

    @ApiModelProperty(value="Start Record")
    private Integer start;

    @ApiModelProperty(value="Record Limit")
    private Integer limit;

    @ApiModelProperty(value="Sorted By?")
    private String sortBy;
    
    @ApiModelProperty(value="Sorted Mode")
    private String sort;

}
