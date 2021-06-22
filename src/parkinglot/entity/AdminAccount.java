package parkinglot.entity;

public class AdminAccount extends Account{
    public boolean addParkingFloor(ParkingLot parkingLot, Floor floor){
        return true;
    }
    public boolean addParkingSpace(Floor floor, ParkingSpace parkingSpace){
        return true;
    }
    public boolean addParkingDisplayBoard(Floor floor, ParkingDisplayBoard parkingDisplayBoard){
        return true;
    }
}
