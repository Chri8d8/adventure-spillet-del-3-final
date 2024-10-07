public class MeleeWeapon extends Weapon{

    public MeleeWeapon(String name , String type) {
        super(name , type);

    }
    @Override
    public boolean canUse() {
        return true;
    }

    @Override
    public void use() {
        System.out.println("du svinger med " + this + " mod den tomme luft");
    }
}
