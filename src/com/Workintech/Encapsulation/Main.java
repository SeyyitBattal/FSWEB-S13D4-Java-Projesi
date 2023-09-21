package com.Workintech.Encapsulation;

public class Main {
    public static void main(String[] args) {


        Player player = new Player("Battal", 130, Weapon.weapon1);
        System.out.println(player.healthRemaining());
        player.loseHealth(55);
        System.out.println(player.healthRemaining());
        player.loseHealth(80);
        System.out.println(player.healthRemaining());
        System.out.println(player.restoreHealth(65));
        System.out.println(player.restoreHealth(50));
        System.out.println("***********************************");
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point(0, 0);
        System.out.println("distance()= " + point.distance());


    }
}