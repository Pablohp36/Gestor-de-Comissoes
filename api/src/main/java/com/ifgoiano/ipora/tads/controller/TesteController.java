package com.ifgoiano.ipora.tads.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 2898807 on 22/11/2016.
 */

@RestController
@RequestMapping("/Teste")
public class TesteController {

    @RequestMapping(value = "/testes", method = RequestMethod.GET,produces = "application/json")
    public List<String> finAll(){
        List<String> lista = new ArrayList<>();
        for (int i = 0 ; i< 50; i++) {
            lista.add("Foi "+i);
        }
        return lista;
    }
}
