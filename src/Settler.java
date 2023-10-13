public class Settler extends Unit {
    public Settler(Tile position, double healthPoints, String faction) {
        super(position, healthPoints, 2, faction);
    }
    //Implement the takeAction() method. The method takes a Tile as input. If this is the tile where the unit is stationed and it is not a city yet, then a city should be built on the specified tile. In such a case the unit is expended. To represent this, remove the unit from the tile. On the other hand, if a city is not built the method simply terminates.
    //Override the equals() method. The method returns true if the Object received as input matches this in type, position, health and faction. Otherwise the method returns false. Note that you do not want to rewrite code that you have already written in the superclass. How can you access methods from the superclass that have been overridden?
    public void takeAction(Tile tile) {
        if (tile == null) {
            throw new IllegalArgumentException();
        }
        if (tile.equals(this.getPosition()) && !tile.isCity()) {
            tile.buildCity();
            this.getPosition().removeUnit(this);
        }
    }
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
