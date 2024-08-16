package com.galaxy.starsim.model;

import com.galaxy.starsim.model.extensions.ScientificNotation;
import jakarta.persistence.*;

@Entity
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String name;

    @Convert(converter = ScientificNotation.class)
    private ScientificNotation mass;

    @Convert(converter = ScientificNotation.class)
    private ScientificNotation radius;

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
}
