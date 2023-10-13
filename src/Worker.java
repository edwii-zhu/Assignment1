public class Worker extends Unit{
    private int jobsDone;
    public Worker(Tile position, double healthPoints, String faction) {
        super(position, healthPoints, 2, faction);
        this.jobsDone = 0;
    }
}
