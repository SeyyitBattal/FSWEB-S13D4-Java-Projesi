package com.Workintech.Encapsulation;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        if (healthPercentage > 100) healthPercentage = 100;
        if (healthPercentage < 0) healthPercentage = 0;
        this.name = name;
        this.healthPercentage = healthPercentage;
        this.weapon = weapon;
    }

    private void healtPerControl(int healthPercentage) {

    }

    public int healthRemaining() {return this.healthPercentage;}

    public int loseHealth(int damage) {
        int result = healthPercentage - damage;
        if (result <= 0) {
            System.out.println(name + " player has been knocked out of game");
            this.healthPercentage= 0;
        }else {
            this.healthPercentage = result;
        }
        return healthPercentage;
    }

    public int restoreHealth(int healthPotion) {
        int result = healthPercentage + healthPotion;
        if (result > 100) healthPercentage = 100;
        else this.healthPercentage = result;
        return healthPercentage;
    }


}
