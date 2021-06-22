package parkinglot;

import parkinglot.entity.Address;
import parkinglot.entity.ParkingLot;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        ParkingLot parkingLot = new ParkingLot();

    }
    public static ParkingLot getParkingLot(){

        Address parkingLotAddress = new Address("rajpal colony", "panchavati");
        ParkingLot parkingLot = new ParkingLot(new ArrayList<>(),new ArrayList<>(),new ArrayList<>(),parkingLotAddress,"Panchavati");

    }



}
