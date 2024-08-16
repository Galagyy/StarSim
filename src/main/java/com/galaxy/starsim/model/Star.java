package com.galaxy.starsim.model;

import com.galaxy.starsim.model.extensions.ScientificNotation;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Star {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String name;

    @Convert(converter = ScientificNotation.class)
    private ScientificNotation mass;

    @Convert(converter = ScientificNotation.class)
    private ScientificNotation radius;

    @OneToMany(mappedBy = "star")
    private List<Planet> plants;

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

    public ScientificNotation getMass() {
        return mass;
    }

    public void setMass(ScientificNotation mass) {
        this.mass = mass;
    }

    public ScientificNotation getRadius() {
        return radius;
    }

    public void setRadius(ScientificNotation radius) {
        this.radius = radius;
    }

    public List<Planet> getPlants() {
        return plants;
    }

    public void setPlants(List<Planet> plants) {
        this.plants = plants;
    }

    public void addPlant(Planet planet) {
        this.plants.add(planet);
    }

    public void removePlanet(Planet planet) {
        this.plants.remove(planet);
    }
}
