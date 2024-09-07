package id.co.digipos.common.exception;

import id.co.digipos.common.context.ApiContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Configuration;

@Configuration
@Log4j2
public class ErrorHelper {

    private ApiContext apiContext;

    public ErrorHelper(ApiContext apiContext) {
        this.apiContext = apiContext;
    }

    public ApiContext getApiContext() {
        return apiContext;
    }
}
