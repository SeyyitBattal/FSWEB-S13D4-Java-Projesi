package com.Workintech.Encapsulation;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage;
        this.weapon = weapon;
    }

    Player player = new Player("Ali", 120, Weapon.weaponEleman1);
    private void healtPerControl(int healthPercentage) {
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }


}
