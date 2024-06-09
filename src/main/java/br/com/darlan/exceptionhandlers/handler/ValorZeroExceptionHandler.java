package br.com.darlan.exceptionhandlers.handler;

import br.com.darlan.exceptionhandlers.dto.ErrorDTO;
import br.com.darlan.exceptionhandlers.exception.ValorZeroException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ValorZeroExceptionHandler {

    @ResponseStatus(HttpStatus.PRECONDITION_FAILED)
    @ResponseBody
    @ExceptionHandler(ValorZeroException.class)
    public ErrorDTO handler(ValorZeroException ex) {
        return new ErrorDTO(
                ex.getMessage(),
                ex.getLancamento()
        );
    }
}
