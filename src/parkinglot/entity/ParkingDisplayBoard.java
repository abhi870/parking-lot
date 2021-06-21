package parkinglot.entity;

import java.util.Map;

public class ParkingDisplayBoard {
    private Map<ParkingSpaceType, Integer> parkingDisplayTypeIntegerMap;
    public void updateFreeSlotsAvailable(){

    }

    public ParkingDisplayBoard(){}
    public ParkingDisplayBoard(Map<ParkingSpaceType, Integer> parkingDisplayTypeIntegerMap){
        this.parkingDisplayTypeIntegerMap = parkingDisplayTypeIntegerMap;
    }

}
