package Enemies;

import Weapons.Weapon;

public abstract class Grunt extends Weapon {
    private String nume="Basic Grunt";
    protected String title="Ordinary Footsolider";
    private String weapon;
    private String melee;


    public String getWeapon() {
        return weapon;

    }

    public String getMelee() {
        return melee;
    }

    public void setWeapon(String weapon,String melee) {
        this.weapon = weapon;
        this.melee = melee;
    }

}

