package com.epam.mjc.stage0;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public String getColor() {
        return color;
    }

    public String getDescription() {
        String resultColor = null;
        if (numberOfPaws > 1 && hasFur) {
             resultColor = "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and a fur.";
        } else if (numberOfPaws == 1 && hasFur) {
            resultColor = "This animal is mostly " + color + ". It has " + numberOfPaws + " paw and a fur.";
        } else if (numberOfPaws > 1 && !hasFur) {
           resultColor = "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and no fur.";
        } else if (numberOfPaws == 1 && !hasFur) {
            resultColor = "This animal is mostly " + color + ". It has " + numberOfPaws + " paw and no fur.";
        }
        return resultColor;
    }
    }







