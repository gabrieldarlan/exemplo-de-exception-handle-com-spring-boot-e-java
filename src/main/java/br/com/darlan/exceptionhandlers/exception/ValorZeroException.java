package br.com.darlan.exceptionhandlers.exception;

public class ValorZeroException extends RuntimeException {
    private final String lancamento;

    public ValorZeroException(String message, String lancamento) {
        super(message);
        this.lancamento = lancamento;
    }

    public String getLancamento() {
        return lancamento;
    }
}
