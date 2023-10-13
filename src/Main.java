public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        ListOfUnits listOfUnits = new ListOfUnits();
        Tile tile = new Tile(0, 0);
        Tile tile1 = new Tile(1, 100);
        Settler settler = new Settler(tile, 100, "Rome");
        Settler settler2 = new Settler(tile, 100, "Rome");
        Archer archer = new Archer(tile, 100, "Rome");
        Archer archer2 = new Archer(tile1, 100, "Greece");
        System.out.println(settler.equals(settler2));
        listOfUnits.addUnit(archer);
        listOfUnits.addUnit(archer2);
        System.out.println(archer.equals(archer2));
    }
}