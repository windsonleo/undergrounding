package com.tecsoluction.underground.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecsoluction.underground.entidade.Usuario;

@Repository
public interface IUsuarioDAO extends JpaRepository<Usuario, UUID> {


//	@Query("SELECT p FROM Usuario p where p.username=")
    Usuario findByEmail(String email);

}
