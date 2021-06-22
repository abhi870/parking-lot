package parkinglot.service;

import parkinglot.entity.ParkingLot;

public interface ParkingLotAdminService {
    void addFloor(ParkingLot parkingLot, Integer bikeSpaceCapacity, Integer carSpaceCapacity, Integer truckSpaceCapacity);
    void addEntrance(ParkingLot parkingLot);
    void addExit(ParkingLot parkingLot);
}
