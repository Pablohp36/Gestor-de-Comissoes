package com.ifgoiano.ipora.tads.controller;

import com.ifgoiano.ipora.tads.model.Cliente;
import com.ifgoiano.ipora.tads.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 2898807 on 22/11/2016.
 */
@CrossOrigin(origins = "http://localhost:8080")
@RestController

public class FaturaController {

    @Autowired
    ClienteRepository repository;

    @RequestMapping(value = "/clientes/excluirtodos", method = RequestMethod.GET)
    public String excluirTodos(){
       List<Cliente> clientes = repository.findAll();
        for ( Cliente cliente: clientes) {
            repository.delete(cliente);
        }
        return "excluido : todos";
    }

    @RequestMapping(value = "/cliente/autoinsert", method = RequestMethod.GET)
    public String autoinserir(){
        Cliente cliente = new Cliente();
        cliente.setId(String.valueOf(ClienteRepository.VERSION.getAndIncrement()));
        cliente.setNome("Wilton Silva");
        repository.save(cliente);
        return "Salvo";
    }

    @RequestMapping(value = "/cliente", method = RequestMethod.POST, produces = "application/json")
    public String inserir(@RequestBody Cliente cliente){
        System.out.println("Nome: "+cliente.getNome());
        System.out.println("Apelido: "+cliente.getApelido());
        System.out.println("CPF: "+cliente.getCodUniIdent());
        cliente.setId(String.valueOf(ClienteRepository.VERSION.getAndIncrement()+1));
       repository.save(cliente);
        return "Salvo";
    }

    @RequestMapping(value = "/cliente/{codigo}", method = RequestMethod.PUT)
    public void atualizar(@RequestBody Cliente cliente){
        repository.save(cliente);
    }

    @RequestMapping(value = "/cliente/{codigo}", method = RequestMethod.DELETE)
    public void excluir(@PathVariable int codigo){
        repository.delete(String.valueOf(codigo));
    }

    @RequestMapping(value = "/cliente/{codigo}", method = RequestMethod.GET, produces = "application/json")
    public Cliente buscar(@PathVariable String codigo){
        System.err.println("Objeto Requisitado : " +codigo);
        Cliente cliente = repository.findOne(codigo);

            return cliente;
    }

    @RequestMapping(value = "/clientes", method = RequestMethod.GET,produces = "application/json")
    public List<Cliente> listarTodos(){
       List<Cliente> clientes = repository.findAll();
        return clientes;
    }
}
