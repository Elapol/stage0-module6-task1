package com.epam.mjc.stage0;

public class Bird extends Animal {

    public Bird(){
        super("blue",2,false);
    }

    public String getDescription() {
       String resultColor = "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() +
                " paws and no fur. Moreover, it has 2 wings and can fly.";
       return resultColor;
    }

    }


