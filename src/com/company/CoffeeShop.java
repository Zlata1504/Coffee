package com.company;

public abstract class CoffeeShop {
    public static void waitCoffee(){
        System.out.println("Please wait a minute");
    }

    public abstract void makeCappuccino();

    public abstract void makeLatte();
    public abstract void makeTea();
}
