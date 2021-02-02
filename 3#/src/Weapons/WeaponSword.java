package Weapons;

import Droids.*;

public class WeaponSword extends Weapon {
    public WeaponSword() {
        super.setTypeOfWeapon("Sword");
    }
    @Override
    public String getTypeOfWeapon() {
        return "Sword";
    }
    public void useWeapon(Droid buffed){
        buffed.setDamage((int)(buffed.getDamage()*1.2));}
}
