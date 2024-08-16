package com.galaxy.starsim.service;

import com.galaxy.starsim.model.Star;
import com.galaxy.starsim.repository.StarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarService {
    @Autowired
    private StarRepository starRepository;

    public List<Star> getAll(){
        return starRepository.findAll();
    }

    public Star getById(long id){
        return starRepository.findById(id).orElse(null);
    }

    public Star createStar(Star star){
        return starRepository.save(star);
    }

    public void deleteStar(long id){
        starRepository.deleteById(id);
    }
}
