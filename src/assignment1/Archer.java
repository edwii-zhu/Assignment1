package assignment1;

public class Archer extends MilitaryUnit{
    //A constructor that takes as input a assignment1.Tile which contains the position of the archer, a double indicating its hp, and a String indicating its faction. The constructor uses the inputs to create an assignment1.Archer with the above characteristic, moving range equal to 2, attack damage equal to 15.0, attack range equal to 2, armor equal to 0, and 5 available arrows.
    private int arrows;
    public Archer(Tile position, double healthPoints, String faction) {
        super(position, healthPoints, 2, faction, 15.0, 2, 0);
        this.arrows = 5;
    }
    public void takeAction(Tile tile) {
        if (arrows == 0) {
            this.arrows = 5;
            return;
        }
        super.takeAction(tile);
        this.arrows--;
    }
    public boolean equals(Object o) {
        if (o.getClass().equals(this.getClass())) {
            Archer a = (Archer) o;
            return (super.equals(o) && this.arrows == a.arrows);
        }
        return super.equals(o);
    }
}
