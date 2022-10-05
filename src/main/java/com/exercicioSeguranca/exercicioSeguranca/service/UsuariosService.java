package com.exercicioSeguranca.exercicioSeguranca.service;

import com.exercicioSeguranca.exercicioSeguranca.model.DtoUsuariosmodel;
import com.exercicioSeguranca.exercicioSeguranca.model.UsuariosModel;
import com.exercicioSeguranca.exercicioSeguranca.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    private BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    public List<DtoUsuariosmodel> buscarTudo(){
        List<UsuariosModel> buscarUsuarios = usuariosRepository.findAll();
        return buscarUsuarios.stream().map(retorno1 -> new DtoUsuariosmodel(retorno1.getNome(),retorno1.getLogin(),retorno1.getSenha())).collect(Collectors.toList());
    }

    public UsuariosModel cadastroUsers(UsuariosModel usuariosModel){
        usuariosModel.setSenha(passwordEncoder().encode(usuariosModel.getSenha()));
        return usuariosRepository.save(usuariosModel);
    }



}
