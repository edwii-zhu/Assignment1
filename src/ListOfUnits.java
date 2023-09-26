public class ListOfUnits {

    private Unit[] units;
    private int size;

    public ListOfUnits() {
        this.units = new Unit[10];
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public Unit[] getList() {
        Unit[] list = new Unit[this.size];
        for (int i = 0; i < this.size; i++) {
            list[i] = this.units[i];
        }
        return list;
    }

    public Unit addUnit(Unit unit) {
        if (this.size == this.units.length) {
            Unit[] newUnits = new Unit[this.units.length * 2];
            for (int i = 0; i < this.size; i++) {
                newUnits[i] = this.units[i];
            }
            this.units = newUnits;
        }
        this.units[this.size] = unit;
        this.size++;
        return unit;
    }

    public int indexOf(Unit unit) {
        for (int i = 0; i < this.size; i++) {
            if (this.units[i].equals(unit)) {
                return i;
            }
        }
        return -1;
    public boolean removeUnit(Unit unit){
        int index = indexOf(unit);
        if (index == -1) {
            return false;
        } else {
            for (int i = index; i < this.size - 1; i++) {
                this.units[i] = this.units[i + 1];
            }
            this.size--;
            return true;
        }
    }
}

