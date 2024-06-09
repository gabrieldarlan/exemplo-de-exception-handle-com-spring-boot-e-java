package br.com.darlan.exceptionhandlers.service;

import br.com.darlan.exceptionhandlers.dto.FinanceiroDTO;
import br.com.darlan.exceptionhandlers.exception.ValorZeroException;
import org.springframework.stereotype.Service;

@Service
public class FinanceiroService {

    public FinanceiroDTO salvar(FinanceiroDTO financeiro) {
        validarValores(financeiro);
        financeiro.setId(1L);
        return financeiro;
    }

    private void validarValores(FinanceiroDTO financeiro) {
        if (financeiro.getValor() == null || financeiro.getValor().doubleValue() == 0) {
            throw new ValorZeroException("O valor do lançamento não pode ser 0 ou null", financeiro.getLancamento());
        }
    }
}
