package id.co.digipos.common.exception;

import id.co.digipos.common.base.BaseException;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponse;

import java.util.Map;

@Setter
@Getter
@ToString
public class BussinessException extends BaseException {

    public BussinessException(HttpStatus httpStatus, String errorCode, String rootCause, String errorDesc, String errorMessage) {
        super(httpStatus, errorCode, rootCause, errorDesc, errorMessage);
    }

    public BussinessException(HttpStatus httpStatus, String rootCause, ErrorResponse errorResponse) {
        super(httpStatus, rootCause, errorResponse);
    }

    public BussinessException(HttpStatus httpStatus, String errorCode, String rootCause) {
        super(httpStatus, errorCode, rootCause);
    }

    public BussinessException(String errorCode, String rootCause) {
        super(errorCode, rootCause);
    }

    public BussinessException(HttpStatus httpStatus, String errorCode, String rootCause, Map<String, String> errorMessageMap) {
        super(httpStatus, errorCode, rootCause, errorMessageMap);
    }
}
