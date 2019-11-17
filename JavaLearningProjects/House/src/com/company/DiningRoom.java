package com.company;

public class DiningRoom {
    private Door theDoor;
    private Chair char1;
    private Chair char2;
    private Chair char3;
    private Chair char4;
    private Table theTable;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;

    public DiningRoom(Door theDoor, Chair char1, Chair char2, Chair char3, Chair char4, Table theTable, Wall wall1, Wall wall2, Wall wall3, Wall wall4) {
        this.theDoor = theDoor;
        this.char1 = char1;
        this.char2 = char2;
        this.char3 = char3;
        this.char4 = char4;
        this.theTable = theTable;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
    }

    public Table getTheTable() {
        return theTable;
    }

    public void openDoor(){
        System.out.println("Dining room -> Door opened");
        theDoor.open();
    }
}
