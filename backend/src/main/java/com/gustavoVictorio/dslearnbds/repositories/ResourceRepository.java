package com.gustavoVictorio.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoVictorio.dslearnbds.entities.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
