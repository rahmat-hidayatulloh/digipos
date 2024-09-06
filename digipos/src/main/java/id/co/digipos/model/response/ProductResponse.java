package id.co.digipos.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import id.co.digipos.common.base.BaseResponse;
import jakarta.persistence.Column;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductResponse extends BaseResponse {
    private String productTypeCode;
    private String name;
    private boolean activeFlag;
}
