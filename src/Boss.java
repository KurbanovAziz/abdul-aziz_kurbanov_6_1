public class Boss extends GameEntity {
    private Weapon weapon;


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String info(){
        return "Boss health: "+ getHealth() + " Boss damage: " + getDamage() + " Type Weapon: " +
                getWeapon().getWeaponType() + " Name Weapon: " + getWeapon().getWeaponName();
    }

}
