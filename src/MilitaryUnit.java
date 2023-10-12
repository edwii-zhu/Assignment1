abstract public class MilitaryUnit extends Unit{
    private double damage;
    private int range;
    private int armor;
    public MilitaryUnit(Tile position, double healthPoints, int movementRange, String faction, double damage, int range, int armor) {
        super(position, healthPoints, movementRange, faction);
        this.damage = damage;
        this.range = range;
        this.armor = armor;
    }
}
