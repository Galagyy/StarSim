package com.galaxy.starsim.controller;

import com.galaxy.starsim.model.Star;
import com.galaxy.starsim.service.StarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stars")
public class StarController {
    @Autowired
    private StarService starService;

    @GetMapping
    public ResponseEntity<List<Star>> getAllStars(){
        List<Star> found = starService.getAll();

        if(found.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(found, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Star> getStarById(@PathVariable int id){
        Star found = starService.getById(id);

        if(found == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(found, HttpStatus.OK);
    }

    @PostMapping("/new")
    public ResponseEntity<Star> createStar(@RequestBody Star star){
        if(star.getID() == null ){
            // TODO: Check if the star has the proper parts.
            return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
        }

        starService.createStar(star);

        return new ResponseEntity<>(star, HttpStatus.CREATED);
    }
}
