package com.loja.rock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loja.rock.entity.ClienteModel;
import com.loja.rock.service.ClienteService;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

  
    @PostMapping
    public ClienteModel criarCliente(@RequestBody ClienteModel cliente) {
        return clienteService.criarCliente(cliente);
    }

    
    @GetMapping("/{id}")
    public ClienteModel buscarClientePorId(@PathVariable int id) {
        return clienteService.buscarClientePorId(id);
    }
}

