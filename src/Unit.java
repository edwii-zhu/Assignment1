abstract public class Unit {
    private Tile position;
    private double healthPoints;
    private int movementRange;
    private String faction;

    public Unit(Tile position, double healthPoints, int movementRange, String faction) {
        this.position = position;
        this.healthPoints = healthPoints;
        this.movementRange = movementRange;
        this.faction = faction;
    }
    public final Tile getPosition() {
        return position;
    }
    public final double getHP() {
        return healthPoints;
    }
    public final String getFaction() {
        return faction;
    }
}
