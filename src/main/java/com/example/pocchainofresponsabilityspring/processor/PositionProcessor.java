package com.example.pocchainofresponsabilityspring.processor;

import com.example.pocchainofresponsabilityspring.model.Colaborador;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import static com.example.pocchainofresponsabilityspring.enums.PositionEnum.*;

@Component
@Order(0)
public class PositionProcessor implements ColaboradorProcessor {
    private ColaboradorProcessor next;

    @Override
    public void setNext(ColaboradorProcessor next) {
        this.next = next;
    }

    @Override
    public boolean isValid(Colaborador colaborador) {
        if(getByString(colaborador.getPosition()) != null){
            if (this.next != null) return next.isValid(colaborador);
            return true;
        }
        return false;
    }
}
