package id.co.digipos.common.base;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponse;

import java.util.Map;

@Setter
@Getter
@ToString
public class BaseException extends RuntimeException{

    protected HttpStatus httpStatus;
    protected String errorCode;
    protected String errorDesc;
    protected String errorMessage;
    protected String rootCause;
    protected ErrorResponse errorResponse;
    protected Map<String, String> errorMessageMap;


    public BaseException(HttpStatus httpStatus, String errorCode, String rootCause, String errorDesc, String errorMessage) {
        super(rootCause);
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
        this.errorMessage = errorMessage;
    }

    public BaseException(HttpStatus httpStatus, String rootCause, ErrorResponse errorResponse) {
        super(rootCause);
        this.httpStatus = httpStatus;
        this.errorResponse = errorResponse;
    }

    public BaseException(HttpStatus httpStatus, String errorCode, String rootCause) {
        super(rootCause);
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
    }

    public BaseException(String errorCode, String rootCause) {
        super(rootCause);
        this.errorCode = errorCode;
    }

    public BaseException(HttpStatus httpStatus, String errorCode, String rootCause, Map<String, String> errorMessageMap){
        super(rootCause);
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.errorMessageMap = errorMessageMap;
    }
}
