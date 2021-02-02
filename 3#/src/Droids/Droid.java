package Droids;
import Weapons.*;

import java.util.Scanner;

public class Droid {
    private String name;
    private int health;
    private int damage;
    private int protection;
    private Weapon weapon;
    private String typeDroid;



    public Droid() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name of droid:");
        this.name = in.nextLine();
        this.weapon = chooseWeapon();
        this.health = 100;
        this.damage = 20;
        this.protection = 10;
        this.typeDroid = "Default";
    }



    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public String getTypeOfDroid() {
        return typeDroid;
    }

    public void setTypeDroid(String typeOfDroid) {
        this.typeDroid = typeOfDroid;
    }

    public boolean droidIsAlive(){
        return this.getHealth() > 0;
    }

    public Weapon chooseWeapon(){
        Scanner in = new Scanner(System.in);
        System.out.print("Choose weapon:\n" +
                "1 - Sword (get +20% damage)\n" +
                "2 - Shield (-50%dmg, 25% of blocking dmg)\n"+
                "3 - Gun (+10 dmg, -20 hp)\n"+
                "4 - No weapon (+20 hp)\n");
        int type = in.nextInt();
        if (type == 1){
             return new WeaponSword();
        }
        else if (type == 2){
            return new WeaponShield();
        }
        else if (type == 3){
            return new WeaponRifle();
        }
        else {
            return new Weapon();
        }
    }

    public void takeCharacteristicsFromWeapon(Droid buffed)
    {
        this.weapon.useWeapon(buffed);
    }
    public int makeHit(Droid defend){
        int i=0;
        i=(this.getDamage()*(100-defend.getProtection())/100);
        if(defend.getTypeOfDroid()=="Dodger"){
            if(Math.random()>0.5) {defend.setHealth((defend.getHealth() - i));return i;}
        }
        else{defend.setHealth((defend.getHealth() - i));return i;}
        return 0;
    }

    public void printDroid(){
        System.out.printf("|\t%-8s|\t%-8s|\t%-8s|\t%d\t\t|\t%d\t\t|\t%d \t\t\t|\n", this.getName(),
                this.getTypeOfDroid(), this.weapon.getTypeOfWeapon(), this.getHealth(),
                this.getDamage(), this.getProtection());
    }
}