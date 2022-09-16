public class Main {
    public static void main(String[] args) {
        Boss bossOne = new Boss();
        bossOne.setHealth(500);
        bossOne.setDamage(50);
        bossOne.setWeapon(new Weapon(WeaponType.GUN, "Desert eagle"));
        System.out.println(bossOne.info());

        Skeleton skeletonOne = new Skeleton();
        skeletonOne.setHealth(200);
        skeletonOne.setDamage(35);
        skeletonOne.setWeapon(new Weapon(WeaponType.BOW,"BowMaster Rebel"));
        skeletonOne.setArrows(15);
        System.out.println(skeletonOne.info());

        Skeleton skeletonTwo = new Skeleton();
        skeletonTwo.setHealth(200);
        skeletonTwo.setDamage(50);
        skeletonTwo.setWeapon(new Weapon(WeaponType.BOW,"Yarrow Gamma"));
        skeletonTwo.setArrows(15);
        System.out.println(skeletonTwo.info());
    }
}