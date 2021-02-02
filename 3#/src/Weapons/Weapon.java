package Weapons;

import Droids.Droid;

public class Weapon {
    private String typeOfWeapon;

    public Weapon() {
        this.typeOfWeapon = "No weapon";
    }

    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }
    public void setTypeOfWeapon(String typeofWeapon){this.typeOfWeapon=typeOfWeapon;}

    public void useWeapon(Droid buffed){
        buffed.setHealth(buffed.getHealth()+20);
    }

}
