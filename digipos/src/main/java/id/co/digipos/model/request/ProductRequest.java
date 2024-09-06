package id.co.digipos.model.request;

import id.co.digipos.common.base.BaseRequest;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductRequest extends BaseRequest {
    private String productCode;
}
