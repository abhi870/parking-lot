package parkinglot.entity;

public class ParkingSpace {
    private Integer spaceId;
    private boolean isFree;
    private Double costPerHour;
    private Vehicle vehicle;
    private ParkingSpaceType parkingSpaceType;

    public ParkingSpace(){}
    public ParkingSpace(Integer spaceId, boolean isFree, Double costPerHour, Vehicle vehicle, ParkingSpaceType parkingSpaceType) {
        this.spaceId = spaceId;
        this.isFree = isFree;
        this.costPerHour = costPerHour;
        this.vehicle = vehicle;
        this.parkingSpaceType = parkingSpaceType;
    }

    public Integer getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(Integer spaceId) {
        this.spaceId = spaceId;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public Double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(Double costPerHour) {
        this.costPerHour = costPerHour;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpaceType getParkingSpaceType() {
        return parkingSpaceType;
    }

    public void setParkingSpaceType(ParkingSpaceType parkingSpaceType) {
        this.parkingSpaceType = parkingSpaceType;
    }
}
