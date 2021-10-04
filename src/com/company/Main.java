package com.company;

import java.util.Scanner;

public class Main {
    //    static Scanner sc = new Scanner(System.in);
//    static CoffeeShop coffeeShop;
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        CoffeeShop coffeeShop;
        System.out.print("Please,choose which city are you from: 1.New York  2.Moscow  3.Beijing 4.Istanbul 5.Madrid");

        int number = sc.nextInt();

        if (number == 1) {
            coffeeShop = new NewYorkCoffeeShop();
            System.out.println("You choose New York.What drink do you prefer?");
            chooseCoffee(sc, coffeeShop);
        } else if (number == 2) {
            coffeeShop = new MoscowCoffeeShop();
            System.out.println("You choose Moscow.What drink do you prefer?");
            chooseCoffee(sc, coffeeShop);
        } else if (number == 3) {
            coffeeShop = new BeijingCoffeeShop();
            System.out.println("You choose Beijing.What drink do you prefer?");
            chooseCoffee(sc, coffeeShop);
        } else if (number == 4) {
            coffeeShop = new IstanbulCoffeeShop();
            System.out.println("You choose Istanbul.What drink do you prefer?");
            chooseCoffee(sc, coffeeShop);
        } else if (number == 5) {
            coffeeShop = new MadridCoffeeShop();
            System.out.println("You choose Madrid.What drink do you prefer?");
            chooseCoffee(sc, coffeeShop);


        } else {
            System.out.println("неизвестная опперация");

        }
        sc.close();
    }

    private static void chooseCoffee(Scanner scanner, CoffeeShop shop) {
        System.out.println("1.Cappuccino 2.Latte 3.Tea");
        int coffee = scanner.nextInt();
        if (coffee == 1) {
            shop.makeCappuccino();
        } else if (coffee == 2) {
            shop.makeLatte();
        } else if (coffee == 3) {
            shop.makeTea();
        } else {
            System.out.println("Неизвестная опперация");
        }
        if (shop instanceof CoffeeShopInterface) {
            System.out.println("Would you like to buy a biscuits? 1.Yes 2.No");
            int number1 = scanner.nextInt();
            if (number1 == 1) {
               CoffeeShopInterface biscuits=(CoffeeShopInterface) shop;
                biscuits.sellBiscuits();
                System.out.println("Thank you for your order.Bye!");

            }

        }


    }
}



