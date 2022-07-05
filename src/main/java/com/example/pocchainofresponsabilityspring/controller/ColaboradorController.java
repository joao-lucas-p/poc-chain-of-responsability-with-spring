package com.example.pocchainofresponsabilityspring.controller;

import com.example.pocchainofresponsabilityspring.model.Colaborador;
import com.example.pocchainofresponsabilityspring.service.ColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/colaborador")
public class ColaboradorController {

    @Autowired
    ColaboradorService service;

    @GetMapping("/check-valid")
    public ResponseEntity<Boolean> isValid(@RequestBody Colaborador colaborador){
        return ResponseEntity.ok(service.checkValid(colaborador));
    }
}
