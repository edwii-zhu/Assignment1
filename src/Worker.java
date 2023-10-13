public class Worker extends Unit{
    private int jobsDone;
    public Worker(Tile position, double healthPoints, String faction) {
        super(position, healthPoints, 2, faction);
        this.jobsDone = 0;
    }
    //Implement the takeAction() method. The method takes a Tile as input. If this is the tile where the unit is stationed and it has not been improved yet, then an improvement should be built on the specified tile. If an improvement is built, then the number of jobs this worker has already performed should increase by one. If the worker reaches 10 jobs, then the unit is expended, i.e. the unit is removed from the tile. If the conditions on the input value are not met, then the method simply terminates.
    //Similar to the Settler, override the equals() method. The method returns true if the Object received as input matches this in type, position, health, faction, and number of jobs performed.
    public void takeAction(Tile tile) {
        if (tile == null) {
            throw new IllegalArgumentException();
        }
        if (tile.equals(this.getPosition()) && !tile.isImproved()) {
            tile.buildImprovement();
            this.jobsDone++;
            if (this.jobsDone == 10) {
                this.getPosition().removeUnit(this);
            }
        }
    }
    public boolean equals(Object o){
        if (o.getClass().equals(this.getClass())) {
            Worker w = (Worker) o;
            return (this.getPosition() == w.getPosition() && Math.pow(this.getHP() - w.getHP(),2) < 0.001 && this.getFaction().equals(w.getFaction()) && this.jobsDone == w.jobsDone);
        }
        return false;

    }
}
