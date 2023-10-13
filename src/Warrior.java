public class Warrior extends MilitaryUnit{
    public Warrior(Tile position, double healthPoints, String faction) {
        super(position, healthPoints, 1, faction, 20.0, 1, 25);
    }
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
