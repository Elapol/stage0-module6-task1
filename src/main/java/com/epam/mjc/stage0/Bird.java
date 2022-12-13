package com.epam.mjc.stage0;

public class Bird extends Animal {
    public Bird(){
        super("blue",2,false);
    }
    public static void main(String[] args) {
        Bird.getDescription("blue", 2,false);

    }
    static void getDescription(String color, int numberOfPaws, boolean hasFur) {
        String resultColor = "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and no fur. Moreover, it has 2 wings and can fly.";
        System.out.println(resultColor);
    }

    }


