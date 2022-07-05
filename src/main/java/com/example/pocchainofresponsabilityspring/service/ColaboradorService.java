package com.example.pocchainofresponsabilityspring.service;

import com.example.pocchainofresponsabilityspring.model.Colaborador;
import com.example.pocchainofresponsabilityspring.processor.ColaboradorProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColaboradorService {
    @Autowired
    private List<ColaboradorProcessor> processorList;

    public Boolean checkValid(Colaborador colaborador){
        for(int i = 0; i < processorList.size(); i++){
            if (i + 1 != processorList.size()){
                processorList.get(i).setNext(processorList.get(i+1));
            }
        }
        return processorList.get(0).isValid(colaborador);
    }
}
