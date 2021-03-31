package com.gustavoVictorio.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoVictorio.dslearnbds.entities.Offer;

public interface OfferRepository extends JpaRepository <Offer, Long> {

}
