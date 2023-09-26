public class Worker extends Unit{
    private int jobsDone = 0;
    public Worker(Tile position, double healthPoints, String faction) {
        super(position, healthPoints, 2, faction);
    }
}
