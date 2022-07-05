package com.example.pocchainofresponsabilityspring.processor;

import com.example.pocchainofresponsabilityspring.model.Colaborador;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class NameProcessor implements ColaboradorProcessor {
    private ColaboradorProcessor next;

    @Override
    public void setNext(ColaboradorProcessor next) {
        this.next = next;
    }

    @Override
    public boolean isValid(Colaborador colaborador) {
        if(!colaborador.getName().matches(".*\\d.*") && colaborador.getName().length() >= 3){
            if (this.next != null) return next.isValid(colaborador);
            return true;
        }
        return false;
    }
}
