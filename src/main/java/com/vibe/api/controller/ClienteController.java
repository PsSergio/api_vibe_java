package com.vibe.api.controller;

import com.vibe.api.model.ClienteModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("cliente/")
public class ClienteController {

    private List<ClienteModel> listaCliente = new ArrayList<>();

    @PostMapping("add")
    public void addCliente(@RequestBody ClienteModel _clienteCadastro){
        listaCliente.add(_clienteCadastro);
    }

    @GetMapping("all")
    public List<ClienteModel> findListClientes(){
        return listaCliente;
    }

}
