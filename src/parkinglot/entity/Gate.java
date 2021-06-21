package parkinglot.entity;

public abstract class Gate {
    private Integer gateId;
    private ParkingAttendant parkingAttendant;

    public Gate(){}
    public Gate(Integer gateId, ParkingAttendant parkingAttendant) {
        this.gateId = gateId;
        this.parkingAttendant = parkingAttendant;
    }

    public Integer getGateId() {
        return gateId;
    }

    public void setGateId(Integer gateId) {
        this.gateId = gateId;
    }

    public ParkingAttendant getParkingAttendant() {
        return parkingAttendant;
    }

    public void setParkingAttendant(ParkingAttendant parkingAttendant) {
        this.parkingAttendant = parkingAttendant;
    }
}
