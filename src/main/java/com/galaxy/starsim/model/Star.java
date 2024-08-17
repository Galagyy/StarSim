package com.galaxy.starsim.model;

import com.galaxy.starsim.model.extensions.ScientificNotation;
import com.galaxy.starsim.model.extensions.SpaceEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Star extends SpaceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String name;

    @Convert(converter = ScientificNotation.class)
    private ScientificNotation mass;

    @Convert(converter = ScientificNotation.class)
    private ScientificNotation radius;

    @OneToMany(mappedBy = "star")
    private List<Planet> planets;

    public Star(){
        this.setX(0);
        this.setY(0);
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ScientificNotation getMass() {
        return mass;
    }

    @Override
    public void setMass(ScientificNotation mass) {
        this.mass = mass;
    }

    @Override
    public ScientificNotation getRadius() {
        return radius;
    }

    @Override
    public void setRadius(ScientificNotation radius) {
        this.radius = radius;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Planet> plants) {
        this.planets = plants;
    }

    public void addPlanet(Planet planet) {
        this.planets.add(planet);
    }

    public void removePlanet(Planet planet) {
        this.planets.remove(planet);
    }
}
