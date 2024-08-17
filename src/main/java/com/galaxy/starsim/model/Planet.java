package com.galaxy.starsim.model;

import com.galaxy.starsim.model.extensions.ScientificNotation;
import com.galaxy.starsim.model.extensions.SpaceEntity;
import jakarta.persistence.*;

@Entity
public class Planet extends SpaceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String name;

    @ManyToOne
    @JoinColumn(name = "star_id")
    private Star star;

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
}
