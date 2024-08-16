package com.galaxy.starsim.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class StarSystem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String name;

    @OneToMany(mappedBy = "starsystem")
    private List<Star> stars;

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

    public List<Star> getStars() {
        return stars;
    }

    public void setStars(List<Star> stars) {
        this.stars = stars;
    }

    public void addStar(Star star) {
        stars.add(star);
    }

    public void removeStar(Star star) {
        stars.remove(star);
    }
}
