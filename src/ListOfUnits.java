public class ListOfUnits {
    // Write a class ListOfUnits. The purpose of this class is to implement your own list of Units. Note that you will not be tested on the efficiency of your code, but we highly encourage you to think about how you can make your code more efficient when implementing a data structure that does not have a fixed size of elements. We want to stress once again that you are not allowed to import any class for this assignment! The class ListOfUnits must have the following private fields:
    //– An array of Units which will be used to store the units that are part of the ListOfUnits.
    //– An int indicating the size of the ListOfUnits, i.e. how many units have been stored in
    //this list.
    //The class must also have the following public methods:
    //– A constructor that takes no inputs and creates an empty list of units. To do so, the fields should be initialized to reflect the fact that at the moment there are no units in the list.
    //– A getSize() method that takes no inputs and returns the number of units that are part of this list.
    //– A getList() method which takes no inputs and returns an array containing all the units that are part of this list. The units should appear in the order in which they have joined the list. This array must contain as many elements as the number of units in the list, and it should not contain any null elements.
    //– A getUnit() method which takes as input an int and returns the reference of the unit at the specified position in this list. If the integer received is out of range, i.e. negative or greater than or equal to the number of units in the list, then the method should throw an IndexOutOfBoundsException.
    //– An addUnit() method which takes as input a Unit and does not return any value. The method adds the Unit at the end of this list. Make sure to handle the case in which there might not be enough space for this unit to join the list. In such case, you need to make sure to create additional space. No unit should be rejected from joining the list. If need be, this is a great place to create your own private method to help you with the implementation. Warning: make sure that no unit is removed from the list as a result of adding the new one.
    //5
    // – An indexOf() method which takes as input a Unit and returns an int indicating the position of the first occurrence of the specified element in this list. If no such unit exists, then the method returns −1. Remember that when comparing reference types you do not want to use ‘==’.
    //– A removeUnit() method which takes as input a Unit and returns a boolean. The method removes the first occurrence of the specified element from the array of units of this list. If no such unit exists, then the method returns false, otherwise, after removing it, the method returns true. Note that this method removes a unit from the list if and only if such unit is equal to the input received. For example, it is not possible to remove an Aztect settler in place of a Sumerian settler.
    //– A getArmy() method that takes no inputs and returns an array of MilitaryUnits. The array should contain all MilitaryUnits that are part of this list. Note that not all units in the list are military units. A ListOfUnits may include also setters and workers. The array returned by the method should not contain any null elements.

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

