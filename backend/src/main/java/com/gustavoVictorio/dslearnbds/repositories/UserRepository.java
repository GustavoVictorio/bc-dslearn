package com.gustavoVictorio.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoVictorio.dslearnbds.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
