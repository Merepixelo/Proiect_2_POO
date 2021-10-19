package Weapons;

public class Weapon {
private String cqc_weapon;
private String range_weapon;
private String weapon;
private String melee;

    public Weapon(){

        weapon="Glock17";
        melee="Boot";

    }
    public  Weapon(String weapon,String melee){
        this.weapon=weapon;
        this.melee=melee;
    }

}
