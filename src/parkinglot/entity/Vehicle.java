package parkinglot.entity;

public class Vehicle {
    private String licenseNumber;
    private VehicleType vehicleType;
    private ParkingTicket parkingTicket;
    private PaymentInfo paymentInfo;

    public Vehicle(){}
    public Vehicle(String licenseNumber, VehicleType vehicleType, ParkingTicket parkingTicket, PaymentInfo paymentInfo) {
        this.licenseNumber = licenseNumber;
        this.vehicleType = vehicleType;
        this.parkingTicket = parkingTicket;
        this.paymentInfo = paymentInfo;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingTicket getParkingTicket() {
        return parkingTicket;
    }

    public void setParkingTicket(ParkingTicket parkingTicket) {
        this.parkingTicket = parkingTicket;
    }

    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }
}
