package com.example.pocchainofresponsabilityspring.processor;

import com.example.pocchainofresponsabilityspring.model.Colaborador;

public interface ColaboradorProcessor {
    void setNext(ColaboradorProcessor next);
    boolean isValid(Colaborador colaborador);
}
