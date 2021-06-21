package parkinglot.entity;

import java.util.Date;

public class PaymentInfo {
    private Integer transactionId;
    private Double amount;
    private Date paymentDate;
    private ParkingTicket parkingTicket;
    private PaymentStatus paymentStatus;


    public PaymentInfo(){}
    public PaymentInfo(Integer transactionId, Double amount, Date paymentDate, ParkingTicket parkingTicket, PaymentStatus paymentStatus) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.parkingTicket = parkingTicket;
        this.paymentStatus = paymentStatus;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public ParkingTicket getParkingTicket() {
        return parkingTicket;
    }

    public void setParkingTicket(ParkingTicket parkingTicket) {
        this.parkingTicket = parkingTicket;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
