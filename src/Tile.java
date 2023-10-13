public class Tile {
    /*Write a class Tile. You can think of a Tile as a square on the board on which the game will be played. A Tile must have the following private fields:
– An int indicating the x-coordinate of the tile.
– An int indicating the y-coordinate of the tile.
– A boolean indicating whether or not a city has been built on the tile.
– A boolean indicating whether or not the tile received some “improvements”. – A ListOfUnits containing all the units positioned on the tile.
     */
    private int x;
    private int y;
    private boolean city;
    private boolean improved;
    private ListOfUnits units;
    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
        this.city = false;
        this.improved = false;
        this.units = new ListOfUnits();
    }
    public boolean isCity() {
        return city;
    }
    public boolean isImproved() {
        return improved;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void buildCity() {
        this.city = true;
    }
    public void buildImprovement() {
        this.improved = true;

    }
    public boolean addUnit(Unit unit) {
        if (unit == null) {
            throw new IllegalArgumentException();
        }
        if (unit instanceof MilitaryUnit){
            for (Unit u : this.units.getList()) {
                if (u instanceof MilitaryUnit && !u.getFaction().equals(unit.getFaction())){
                    return false;
                }
            }
        }
        this.units.addUnit(unit);
        return true;

    }
    public boolean removeUnit(Unit unit) {
        return(this.units.removeUnit(unit));
    }
    public Unit selectWeakEnemy(String faction) {
        if (faction == null) {
            throw new IllegalArgumentException();
        }
        Unit weakest = null;
        for (Unit unit : this.units.getList()) {
            if (! unit.getFaction().equals(faction)) {
                if (weakest == null) {
                    weakest = unit;
                } else if (unit.getHP() < weakest.getHP()) {
                    weakest = unit;
                }
            }
        }
        // if (weakest == null){
        //    return weakest;
        return weakest;
    }
    public static double getDistance(Tile tile1, Tile tile2) {
        if (tile1 == null || tile2 == null) {
            throw new IllegalArgumentException();
        }
        return Math.sqrt(Math.pow(tile1.getX() - tile2.getX(), 2) + Math.pow(tile1.getY() - tile2.getY(), 2));
    }
}