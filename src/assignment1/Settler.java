package assignment1;

public class Settler extends Unit {
    public Settler(Tile position, double healthPoints, String faction) {
        super(position, healthPoints, 2, faction);
    }
    public void takeAction(Tile tile) {
        if (tile.equals(this.getPosition()) && !tile.isCity()) {
            tile.buildCity();
            this.getPosition().removeUnit(this);
        }
    }
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
