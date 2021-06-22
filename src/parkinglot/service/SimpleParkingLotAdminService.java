package parkinglot.service;

import parkinglot.entity.Address;
import parkinglot.entity.ParkingLot;
import parkinglot.entity.ParkingSpace;
import parkinglot.util.ParkingLotUtils;

import java.util.ArrayList;
import java.util.List;

public class SimpleParkingLotAdminService implements ParkingLotAdminService{

    private ParkingLot parkingLot;


   public SimpleParkingLotAdminService(){
       this.parkingLot = new ParkingLot(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new Address("rajpal colony","panchavati")
               , "parkLot1");
   }

    @Override
    public void addFloor(ParkingLot parkingLot, Integer bikeSpaceCapacity, Integer carSpaceCapacity, Integer truckSpaceCapacity) {
        Integer floorLevel = ParkingLotUtils.addFloor(parkingLot);
        List<ParkingSpace> parkingSpacesForFloor = ParkingLotUtils.getParkingSpacesForFloor(bikeSpaceCapacity,carSpaceCapacity,truckSpaceCapacity);
        parkingLot.getFloors().get(floorLevel).setParkingSpaces(parkingSpacesForFloor);
        parkingLot.getFloors().get(floorLevel).setParkingDisplayBoard(ParkingLotUtils.getParkingDisplayBoard(bikeSpaceCapacity, carSpaceCapacity, truckSpaceCapacity));
    }

    @Override
    public void addEntrance(ParkingLot parkingLot) {

    }

    @Override
    public void addExit(ParkingLot parkingLot) {

    }
}
