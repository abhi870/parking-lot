package parkinglot.entity;

import java.util.Date;

public class ParkingTicket {
    private Integer ticketId;
    private Integer levelId;
    private Integer spaceId;
    private Date VehicleEntryDate;
    private Date VehicleExitDate;
    private ParkingSpace parkingSpaceType;
    private Double totalCost;
    private ParkingTicketStatus parkingTicketStatus;

    public Double updateTotalCost(){
        return null;
    }
    public void updateVehicleExitTime(){}

    public ParkingTicket(){}
    public ParkingTicket(Integer ticketId, Integer levelId, Integer spaceId, Date vehicleEntryDate, Date vehicleExitDate, ParkingSpace parkingSpaceType, Double totalCost, ParkingTicketStatus parkingTicketStatus) {
        this.ticketId = ticketId;
        this.levelId = levelId;
        this.spaceId = spaceId;
        VehicleEntryDate = vehicleEntryDate;
        VehicleExitDate = vehicleExitDate;
        this.parkingSpaceType = parkingSpaceType;
        this.totalCost = totalCost;
        this.parkingTicketStatus = parkingTicketStatus;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(Integer spaceId) {
        this.spaceId = spaceId;
    }

    public Date getVehicleEntryDate() {
        return VehicleEntryDate;
    }

    public void setVehicleEntryDate(Date vehicleEntryDate) {
        VehicleEntryDate = vehicleEntryDate;
    }

    public Date getVehicleExitDate() {
        return VehicleExitDate;
    }

    public void setVehicleExitDate(Date vehicleExitDate) {
        VehicleExitDate = vehicleExitDate;
    }

    public ParkingSpace getParkingSpaceType() {
        return parkingSpaceType;
    }

    public void setParkingSpaceType(ParkingSpace parkingSpaceType) {
        this.parkingSpaceType = parkingSpaceType;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public ParkingTicketStatus getParkingTicketStatus() {
        return parkingTicketStatus;
    }

    public void setParkingTicketStatus(ParkingTicketStatus parkingTicketStatus) {
        this.parkingTicketStatus = parkingTicketStatus;
    }
}
