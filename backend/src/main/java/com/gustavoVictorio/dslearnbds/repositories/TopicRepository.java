package com.gustavoVictorio.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoVictorio.dslearnbds.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long>{

}
