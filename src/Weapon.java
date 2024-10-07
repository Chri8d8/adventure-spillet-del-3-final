public abstract class Weapon extends Item {
    private  String name;
    private  String type;

    public Weapon(String name , String type) {
        super(name , type);
        this.name = name;
        this.type = type;
    }
    public abstract boolean canUse();

    public abstract void use();


    @Override
    public String toString() {
        return name;
    }
}
