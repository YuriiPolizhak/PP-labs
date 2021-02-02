package Weapons;

import Droids.Droid;

public class WeaponShield extends Weapon {
    public WeaponShield() {
        super.setTypeOfWeapon("Shield");

    }

    @Override
    public String getTypeOfWeapon() {
        return "Shield";
    }
    public void useWeapon(Droid buffed) {
        buffed.setProtection((int)(buffed.getProtection()*1.25));
        buffed.setDamage((int)(buffed.getDamage()*0.5));
    }
}