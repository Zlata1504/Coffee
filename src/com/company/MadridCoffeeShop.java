package com.company;

public class MadridCoffeeShop extends CoffeeShop implements CoffeeShopInterface {
    @Override
    public  void makeCappuccino(){
        waitCoffee();
        System.out.println("Thanks for order in Madrid Coffee shop, take your Cappuccino.");

    }

    @Override
    public void makeLatte() {
        waitCoffee();
        System.out.println("Thanks for order in Madrid Coffee shop, take your Latte. ");
    }

    @Override
    public void makeTea() {
        waitCoffee();
        System.out.println("Thanks for order in Madrid Coffee shop, take your Tea.");


    }

    @Override
    public void sellBiscuits() {
        System.out.println("Take your biscuits.");

    }
}
