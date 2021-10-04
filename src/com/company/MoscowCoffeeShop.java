package com.company;

public class MoscowCoffeeShop extends CoffeeShop{
    @Override
    public  void makeCappuccino(){
        waitCoffee();
        System.out.println("Thanks for order in Moscow Coffee shop, take your Cappuccino. Bye!");

    }

    @Override
    public void makeLatte() {
        waitCoffee();
        System.out.println("Thanks for order in Moscow Coffee shop, take your Latte. Bye!");
    }

    @Override
    public void makeTea() {
        waitCoffee();
        System.out.println("Thanks for order in Moscow Coffee shop, take your Tea. Bye!");


    }
}
