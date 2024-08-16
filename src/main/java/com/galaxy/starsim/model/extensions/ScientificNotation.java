package com.galaxy.starsim.model.extensions;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ScientificNotation implements AttributeConverter<ScientificNotation, String> {
    private double significand;
    private int exponent;

    public ScientificNotation(double significand, int exponent) {
        this.significand = significand;
        this.exponent = exponent;
    }

    public ScientificNotation(){}

    @Override
    public String convertToDatabaseColumn(ScientificNotation attribute) {
        if(attribute == null) return null; else return attribute.toString();
    }

    @Override
    public ScientificNotation convertToEntityAttribute(String dbData) {
        if(dbData == null) return null; else return new ScientificNotation();
    }

    public double getSignificand() {
        return significand;
    }

    public void setSignificand(double significand) {
        this.significand = significand;
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }
}