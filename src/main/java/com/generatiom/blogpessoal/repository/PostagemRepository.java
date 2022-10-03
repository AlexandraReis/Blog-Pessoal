package com.generatiom.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generatiom.blogpessoal.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long >{

	public List<Postagem> findByTituloContainingIgnoreCase(@Param("titulo")String titulo);
}
