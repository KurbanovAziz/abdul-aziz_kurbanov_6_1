public class Main {
    public static void main(String[] args) {
            Boss bossOne = new Boss();
            bossOne.setHealth(500);
            bossOne.setDamage(50);
            bossOne.setWeapon(bossOne.weapon);
        System.out.println(bossOne.getHealth() + " " + bossOne.getDamage() + " " + bossOne.getWeapon());


    }
}