package com.exercicioSeguranca.exercicioSeguranca.repository;

import com.exercicioSeguranca.exercicioSeguranca.model.UsuariosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends JpaRepository<UsuariosModel,Long> {

}
