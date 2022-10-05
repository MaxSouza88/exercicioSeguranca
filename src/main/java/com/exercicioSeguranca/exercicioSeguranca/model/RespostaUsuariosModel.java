package com.exercicioSeguranca.exercicioSeguranca.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RespostaUsuariosModel {


    private String nome;
    private String login;
    private String senha;

}
