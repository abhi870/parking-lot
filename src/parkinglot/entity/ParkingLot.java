package parkinglot.entity;

import java.util.List;

public class ParkingLot {
    private List<Floor> floors;
    private List<Entrance> entrances;
    private List<Exit> exits;
    private Address address;
    private String parkingLotName;

    public boolean isParkingSlotAvailable(Vehicle vehicle){
        return true;
    }
    public boolean updateParkingAttendant(ParkingAttendant parkingAttendant, Integer gateId){
    return true;
        }

    public ParkingLot(){}
    public ParkingLot(List<Floor> floors, List<Entrance> entrances, List<Exit> exits, Address address, String parkingLotName) {
        this.floors = floors;
        this.entrances = entrances;
        this.exits = exits;
        this.address = address;
        this.parkingLotName = parkingLotName;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Entrance> getEntrances() {
        return entrances;
    }

    public void setEntrances(List<Entrance> entrances) {
        this.entrances = entrances;
    }

    public List<Exit> getExits() {
        return exits;
    }

    public void setExits(List<Exit> exits) {
        this.exits = exits;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getParkingLotName() {
        return parkingLotName;
    }

    public void setParkingLotName(String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }
}
