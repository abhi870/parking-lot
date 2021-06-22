package parkinglot.util;

import parkinglot.entity.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static parkinglot.constants.ApplicationConstants.*;

public class ParkingLotUtils {


    public static void addFloors(ParkingLot parkingLot, Integer floorCount){
        List<Floor> floors = new ArrayList<>();
        for(int i=1;i<=floorCount;i++) {
            List<ParkingSpace> parkingSpaces = getParkingSpacesForFloor(BIKE_PARKING_CAPACITY, CAR_PARKING_CAPACITY, TRUCK_PARKING_CAPACITY);
            ParkingDisplayBoard parkingDisplayBoard = getParkingDisplayBoard(BIKE_PARKING_CAPACITY, CAR_PARKING_CAPACITY, TRUCK_PARKING_CAPACITY);
            floors.add(new Floor(i, false, parkingSpaces, parkingDisplayBoard));
        }
        parkingLot.getFloors().addAll(floors);
    }
    public static Integer addFloor(ParkingLot parkingLot){
        List<Floor> floors = new ArrayList<>();
        Integer floorLevel = parkingLot.getFloors().size()+1;
        List<ParkingSpace> parkingSpaces = getParkingSpacesForFloor(BIKE_PARKING_CAPACITY, CAR_PARKING_CAPACITY, TRUCK_PARKING_CAPACITY);
        ParkingDisplayBoard parkingDisplayBoard = getParkingDisplayBoard(BIKE_PARKING_CAPACITY, CAR_PARKING_CAPACITY, TRUCK_PARKING_CAPACITY);
        floors.add(new Floor(parkingLot.getFloors().size()+1, false, parkingSpaces, parkingDisplayBoard));
        parkingLot.getFloors().addAll(floors);
        return floorLevel;
    }
    public static ParkingDisplayBoard getParkingDisplayBoard(Integer bikeParkingCapacity, Integer carParkingCapacity, Integer truckParkingCapacity){
        Map<ParkingSpaceType, Integer> parkingSpaceTypeMap = new HashMap<>();
        parkingSpaceTypeMap.put(ParkingSpaceType.BIKE_PARKING, bikeParkingCapacity);
        parkingSpaceTypeMap.put(ParkingSpaceType.CAR_PARKING, carParkingCapacity);
        parkingSpaceTypeMap.put(ParkingSpaceType.TRUCK_PARKING, truckParkingCapacity);
        ParkingDisplayBoard parkingDisplayBoard = new ParkingDisplayBoard(parkingSpaceTypeMap);
        return parkingDisplayBoard;
    }
    public static List<ParkingSpace> getParkingSpacesForFloor(Integer bikeParkingSpaceCount, Integer carParkingSpaceCount,
                                                              Integer truckParkingSpaceCount){
        Integer currentId = 1;
        List<ParkingSpace> parkingSpaceList = new ArrayList<>();
        parkingSpaceList.addAll(getBikeParkingSpacesForFloor(currentId,bikeParkingSpaceCount));
        currentId = bikeParkingSpaceCount+1;
        parkingSpaceList.addAll(getCarParkingSpacesForFloor(currentId, carParkingSpaceCount));
        currentId = carParkingSpaceCount+1;
        parkingSpaceList.addAll(getTruckParkingSpacesForFloor(currentId, truckParkingSpaceCount));
        currentId = truckParkingSpaceCount+1;
        return parkingSpaceList;
    }
    private static List<ParkingSpace> getBikeParkingSpacesForFloor(Integer currentId, Integer noOfParkingSpaces){
        List<ParkingSpace> parkingSpacesForFloor = new ArrayList<>();
        for(int i=currentId;i<=noOfParkingSpaces;i++)
            parkingSpacesForFloor.add(new ParkingSpace(i,false, BIKE_PARKING_COST_PER_HOUR,null, ParkingSpaceType.BIKE_PARKING));
        return parkingSpacesForFloor;
    }
    private static List<ParkingSpace> getCarParkingSpacesForFloor(Integer currentId, Integer noOfParkingSpaces){
        List<ParkingSpace> parkingSpacesForFloor = new ArrayList<>();
        for(int i=currentId;i<=noOfParkingSpaces;i++)
            parkingSpacesForFloor.add(new ParkingSpace(i,false, CAR_PARKING_COST_PER_HOUR,null, ParkingSpaceType.CAR_PARKING));
        return parkingSpacesForFloor;
    }
    private static List<ParkingSpace> getTruckParkingSpacesForFloor(Integer currentId, Integer noOfParkingSpaces){
        List<ParkingSpace> parkingSpacesForFloor = new ArrayList<>();
        for(int i=currentId;i<=noOfParkingSpaces;i++)
            parkingSpacesForFloor.add(new ParkingSpace(i,false, TRUCK_PARKING_COST_PER_HOUR,null, ParkingSpaceType.TRUCK_PARKING));
        return parkingSpacesForFloor;
    }
}
