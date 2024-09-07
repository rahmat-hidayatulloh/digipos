package id.co.digipos.common.exception;

import id.co.digipos.model.response.ErrorResponse;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Log4j2
@ControllerAdvice
public class GlobalExceptionHandler {

    private ErrorHelper errorHelper;

    public GlobalExceptionHandler(ErrorHelper errorHelper) {
        this.errorHelper = errorHelper;
    }

    public ResponseEntity<ErrorResponse> renderBusinessErrorResponse(BussinessException exception) {
        log.error("BusinessException occurred: ", exception);
        snapshotTrace(exception);
        return null;
    }

    private void snapshotTrace(Exception ex) {
        try {
            List<String> ListError = Arrays.asList(ExceptionUtils.getRootCauseStackTrace(ex))
                    .stream()
                    .filter(x -> StringUtils.contains(x, "digipos")
                            || !StringUtils.startsWith(x.trim(), "at"))
                    .map(x -> x.toString().trim())
                    .collect(Collectors.toList());
            errorHelper.getApiContext().setStackTrace(ListError);
        } catch (Exception e) {

        }
    }
}