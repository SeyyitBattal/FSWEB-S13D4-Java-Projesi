package com.Workintech.PlayerPackage;

import com.Workintech.PointPackage.Weapon;

public class MainPlayer {
    public static void main(String[] args) {
        Player player = new Player("Battal", 130, Weapon.weapon1);
        System.out.println(player.healthRemaining());
        player.loseHealth(55);
        System.out.println(player.healthRemaining());
        player.loseHealth(80);
        System.out.println(player.healthRemaining());
        System.out.println(player.restoreHealth(65));
        System.out.println(player.restoreHealth(50));

    }
}