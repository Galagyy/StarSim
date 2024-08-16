package com.galaxy.starsim.repository;

import com.galaxy.starsim.model.StarSystem;
import org.springframework.data.jpa.repository.JpaRepository;

@Deprecated
public interface StarSystemRepository extends JpaRepository<StarSystem, Long>{

}
