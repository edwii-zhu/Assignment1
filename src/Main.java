public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        ListOfUnits listOfUnits = new ListOfUnits();
        Settler settler = new Settler(new Tile(0, 0), 100, "Rome");
        Archer archer = new Archer(new Tile(0, 0), 100, "Rome");
        listOfUnits.addUnit(settler);
        listOfUnits.addUnit(archer);
        System.out.println(listOfUnits.getUnit(1));
        System.out.println(listOfUnits.getSize());
        System.out.println(listOfUnits.indexOf(settler));
        for (Unit unit : listOfUnits.getList()) {
            System.out.println(unit);}
        for (MilitaryUnit militaryUnit : listOfUnits.getArmy()) {
            System.out.println(militaryUnit);}
        }
    }

