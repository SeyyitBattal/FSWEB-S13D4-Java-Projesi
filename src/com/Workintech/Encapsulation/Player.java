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

    Player player = new Player("Ali", 120, Weapon.weapon1);

    private void healtPerControl(int healthPercentage) {
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    public int healthRemaining(int healthPercentage) {
        return healthPercentage;
    }

    public int loseHealth(int damage) {
        int losePer = healthRemaining(this.healthPercentage) - damage;
        if (this.healthPercentage < 0) {
            System.out.println(name + " player has been knocked out of game");
        }
        return losePer;
    }

    public int restoreHealth(int healthPotion) {
        int addPer = healthRemaining(this.healthPercentage) + healthPotion;
        if (this.healthPercentage > 100) {
            this.healthPercentage = 100;
        }
        return addPer;
    }


}
