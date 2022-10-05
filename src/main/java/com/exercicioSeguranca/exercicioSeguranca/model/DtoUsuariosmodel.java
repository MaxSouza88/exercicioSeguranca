package com.exercicioSeguranca.exercicioSeguranca.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoUsuariosmodel {


    private String nome;
    private String login;
    private String senha;

}
