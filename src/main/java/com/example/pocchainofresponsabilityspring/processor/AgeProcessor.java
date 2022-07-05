package com.example.pocchainofresponsabilityspring.processor;

import com.example.pocchainofresponsabilityspring.model.Colaborador;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class AgeProcessor implements ColaboradorProcessor {
    private ColaboradorProcessor next;

    @Override
    public void setNext(ColaboradorProcessor next) {
        this.next = next;
    }

    @Override
    public boolean isValid(Colaborador colaborador) {
        if(colaborador.getAge() >= 18){
            if (this.next != null) return next.isValid(colaborador);
            return true;
        }
        return false;
    }
}
