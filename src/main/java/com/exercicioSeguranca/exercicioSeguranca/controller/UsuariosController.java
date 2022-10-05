package com.exercicioSeguranca.exercicioSeguranca.controller;

import com.exercicioSeguranca.exercicioSeguranca.model.DtoUsuariosmodel;
import com.exercicioSeguranca.exercicioSeguranca.model.UsuariosModel;
import com.exercicioSeguranca.exercicioSeguranca.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    @GetMapping(path = "/usuarios")
    public ResponseEntity<List<DtoUsuariosmodel>> buscarTudo () {
        return ResponseEntity.ok(usuariosService.buscarTudo());
    }

    @PostMapping(path = "/usuarios/cadastro")
    public ResponseEntity<UsuariosModel> cadastrarConta(@RequestBody UsuariosModel usuariosModel){
        UsuariosModel cadastroUsers = usuariosService.cadastroUsers(usuariosModel);
        return new ResponseEntity<>(cadastroUsers, HttpStatus.CREATED);
    }

}
