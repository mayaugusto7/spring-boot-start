package com.mayribeiro.contatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayribeiro.contatos.model.Contato;

public interface ContatosRepository extends JpaRepository<Contato, Long> {

}
