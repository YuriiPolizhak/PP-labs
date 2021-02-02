package Weapons;

import Droids.Droid;

public class WeaponRifle extends Weapon {
    public WeaponRifle() {
        super.setTypeOfWeapon("Riffle");
    }

    @Override
    public String getTypeOfWeapon() {
        return "Riffle";
    }
    public void useWeapon(Droid buffed) {
        buffed.setDamage(buffed.getDamage()+10);
        buffed.setHealth(buffed.getHealth()-20);
    }
}
