package parkinglot.entity;

import java.util.List;

public class Floor {
    private Integer level;
    private boolean isFull;
    private List<ParkingSpace> parkingSpaces;
    private ParkingDisplayBoard parkingDisplayBoard;
    public Floor(){
    }

    public Floor(Integer level, boolean isFull, List<ParkingSpace> parkingSpaces, ParkingDisplayBoard parkingDisplayBoard) {
        this.level = level;
        this.isFull = isFull;
        this.parkingSpaces = parkingSpaces;
        this.parkingDisplayBoard = parkingDisplayBoard;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public List<ParkingSpace> getParkingSpaces() {
        return parkingSpaces;
    }

    public void setParkingSpaces(List<ParkingSpace> parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }

    public ParkingDisplayBoard getParkingDisplayBoard() {
        return parkingDisplayBoard;
    }

    public void setParkingDisplayBoard(ParkingDisplayBoard parkingDisplayBoard) {
        this.parkingDisplayBoard = parkingDisplayBoard;
    }
}
