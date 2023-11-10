package assignment1;
public abstract class Unit {
    private Tile position;
    private double healthPoints;
    private final int movementRange;
    private final String faction;

    public Unit(Tile position, double healthPoints, int movementRange, String faction) {
        this.position = position;
        this.healthPoints = healthPoints;
        this.movementRange = movementRange;
        this.faction = faction;
        if (!position.addUnit(this))
            throw new IllegalArgumentException();
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

    public boolean moveTo(Tile tile) {
        if (tile == null) {
            return false;
        }
        if (Tile.getDistance(tile, position) > this.movementRange) {
            return false;
        }
        if (tile.addUnit(this)) {
            this.position.removeUnit(this);
            this.position = tile;
            return true;
        }
        return false;
    }

    public void receiveDamage(double damage) {
        if (damage < 0) {
            return;
        }
        if (this.position.isCity()) {
            damage *= 0.9;
        }
        this.healthPoints -= damage;
        if (this.healthPoints <= 0) {
            this.healthPoints = 0;
            this.position.removeUnit(this);
        }
    }

    public abstract void takeAction(Tile tile);

    public boolean equals(Object o) {
        if (o.getClass().equals(this.getClass())) {
            Unit u = (Unit) o;
            return (this.position == u.position &&
                    Math.pow(this.healthPoints - u.healthPoints, 2) < 0.001 &&
                    this.faction.equals(u.faction));}
            return false;
    }
}