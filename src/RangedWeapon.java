public class RangedWeapon extends Weapon{
    private int ammunition;

    public RangedWeapon(String name , String type , int ammunition) {
        super(name , type);
        this.ammunition = ammunition;
    }

    @Override
    public boolean canUse() {
        return ammunition > 0;
    }

    @Override
    public void use() {
        if (canUse()) {
            ammunition--;
        } else {
            System.out.println("Dit våben " + this + " er løbet tør for ammunition.");
        }
    }
}
