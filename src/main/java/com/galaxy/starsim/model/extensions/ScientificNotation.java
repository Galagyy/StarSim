package com.galaxy.starsim.model.extensions;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ScientificNotation implements AttributeConverter<ScientificNotation, String> {
    private double significand;
    private int exponent;
    private boolean signed;

    public ScientificNotation(double significand, int exponent, boolean signed) throws Exception{
        this.significand = significand;
        this.exponent = exponent;
        this.signed = signed;
    }

    public ScientificNotation(){}

    public static ScientificNotation compare(ScientificNotation num1, ScientificNotation num2) {
        // Check if one is a negative number and one is positive.
        if(num1.isSigned() && !num2.isSigned()){
            return num2;
        } else if(num2.isSigned() && !num1.isSigned()){
            return num1;
        }

        // Since they both feature the same sign we can simply check for signs using one.
        boolean isSigned = (num2.isSigned());

        // Compare the exponents to check which one has a higher power.
        if(num1.getExponent() > num2.getExponent()){
            if(!isSigned){
                return num1;
            }

            return num2;
        } else if(num1.getExponent() < num2.getExponent()){
            if(!isSigned){
                return num2;
            }

            return num1;
        }

        // Compare by the actual values if the exponents and the signs match up.
        if(num1.getSignificand() > num2.getSignificand()){
            if(!isSigned){
                return num1;
            }

            return num2;
        }

        if(!isSigned){
            return num2;
        }

        return num1;
    }

    public static ScientificNotation convertToScientificNotation(Long num){
        // TODO: Complete scientific notation conversion method.

        return new ScientificNotation();
    }

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

    public boolean isSigned() {
        return signed;
    }

    public void setSigned(boolean signed) {
        this.signed = signed;
    }
}