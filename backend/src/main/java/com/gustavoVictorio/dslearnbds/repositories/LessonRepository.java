package com.gustavoVictorio.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoVictorio.dslearnbds.entities.Lesson;

public interface LessonRepository  extends JpaRepository<Lesson, Long>{

}
