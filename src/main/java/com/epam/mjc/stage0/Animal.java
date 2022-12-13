package com.epam.mjc.stage0;

public class Animal {

    private static String color;
    private int numberOfPaws;
    private boolean hasFur;

    Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("black", 4, true);
        Animal.getDescription("black", 1, true);
    }

    static void getDescription(String color, int numberOfPaws, boolean hasFur) {
        if (numberOfPaws > 1 && hasFur == true) {
            String resultColor = "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and a fur.";
            System.out.println(resultColor);
        } else if (numberOfPaws == 1 && hasFur == true) {
            String resultColor = "This animal is mostly " + color + ". It has " + numberOfPaws + " paw and a fur.";
            System.out.println(resultColor);
        } else if (numberOfPaws > 1 && hasFur == false) {
            String resultColor = "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and no fur.";
            System.out.println(resultColor);
        } else if (numberOfPaws == 1 && hasFur == false) {
            String resultColor = "This animal is mostly " + color + ". It has " + numberOfPaws + " paw and no fur.";
            System.out.println(resultColor);
        }
    }


    }







