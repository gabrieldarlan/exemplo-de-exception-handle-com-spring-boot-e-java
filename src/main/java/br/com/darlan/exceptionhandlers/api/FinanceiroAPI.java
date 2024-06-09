package br.com.darlan.exceptionhandlers.api;

import br.com.darlan.exceptionhandlers.dto.FinanceiroDTO;
import br.com.darlan.exceptionhandlers.service.FinanceiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/financeiro")
public class FinanceiroAPI {

    @Autowired
    private FinanceiroService financeiroService;

    @PostMapping
    public FinanceiroDTO salvar(@RequestBody FinanceiroDTO financeiroDTO) {
        return financeiroService.salvar(financeiroDTO);
    }
}
