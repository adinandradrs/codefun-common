package id.codefun.common.model.response;

import org.springframework.data.domain.Page;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageResponse extends BaseResponse {

    private transient Page<?> page;

}
