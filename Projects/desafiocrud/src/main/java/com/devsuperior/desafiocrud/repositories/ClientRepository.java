package com.devsuperior.desafiocrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.desafiocrud.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
