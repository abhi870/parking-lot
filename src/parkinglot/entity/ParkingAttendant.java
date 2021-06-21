package parkinglot.entity;

import parkinglot.service.PaymentService;

public class ParkingAttendant extends Account{
    private PaymentService paymentService;
    public ParkingAttendant(){}

    public ParkingAttendant(String name, String email, String password, Integer employeeId, Address address, PaymentService paymentService) {
        super(name, email, password, employeeId, address);
        this.paymentService = paymentService;
    }

    public boolean processVehicleEntry(Vehicle vehicle){
        return true;
    }
    public PaymentInfo processPayment(ParkingTicket parkingTicket){
        return null;
    }
}
