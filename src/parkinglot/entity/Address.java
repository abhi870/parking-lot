package parkinglot.entity;

public class Address {
    private String street;
    private String apartmaentName;
    private Integer fltNo;
    private String area;
    private AddressType addressType;

    public Address(){}

    public Address(String street, String apartmaentName, Integer fltNo, String area, AddressType addressType) {
        this.street = street;
        this.apartmaentName = apartmaentName;
        this.fltNo = fltNo;
        this.area = area;
        this.addressType = addressType;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartmaentName() {
        return apartmaentName;
    }

    public void setApartmaentName(String apartmaentName) {
        this.apartmaentName = apartmaentName;
    }

    public Integer getFltNo() {
        return fltNo;
    }

    public void setFltNo(Integer fltNo) {
        this.fltNo = fltNo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }
}


