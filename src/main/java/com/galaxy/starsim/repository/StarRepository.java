package com.galaxy.starsim.repository;

import com.galaxy.starsim.model.Star;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StarRepository extends JpaRepository<Star, Long> {
}
