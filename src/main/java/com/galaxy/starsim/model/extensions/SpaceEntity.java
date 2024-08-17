package com.galaxy.starsim.model.extensions;

public abstract class SpaceEntity {
    int x;
    int y;

    ScientificNotation mass;
    ScientificNotation radius;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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
