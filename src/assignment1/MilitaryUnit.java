package assignment1;

abstract public class MilitaryUnit extends Unit{
    private final double damage;
    private final int range;
    private final int armor;
    public MilitaryUnit(Tile position, double healthPoints, int movementRange, String faction, double damage, int range, int armor) {
        super(position, healthPoints, movementRange, faction);
        this.damage = damage;
        this.range = range;
        this.armor = armor;
    }
    public void takeAction(Tile tile){
        //– Implement the takeAction() method. The method takes a assignment1.Tile as input. If the distance
    //between the target tile and the position of the unit is greater the unit’s
    //attack range, then an attack is not possible and the method terminates. Otherwise, the weakest enemy (a unit of a different faction) on the target tile is selected and receives a damage equal to this unit’s attack damage. Note that, if this unit is stationed on a tile which has been improved, then the damage inflicted should be increased by 5%. If no enemy unit is stationed on the specified tile, then the method does not do anything.
        if (Tile.getDistance(tile,this.getPosition()) > this.range) {
            return;
        }
        Unit weakest = tile.selectWeakEnemy(this.getFaction());
        if (weakest != null) {
            if (this.getPosition().isImproved()) {
                weakest.receiveDamage(this.damage * 1.05);
            }
            else {
                weakest.receiveDamage(this.damage);
            }

        }
    }
    public void receiveDamage(double damage){
       super.receiveDamage(damage * (100.0/(100.0 + this.armor)));
    }
}