package com.galaxy.starsim.repository;

import com.galaxy.starsim.model.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository extends JpaRepository<Planet, Long> {
}
