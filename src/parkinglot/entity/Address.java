package parkinglot.entity;

public class Address {
    private String street;
    private String area;

    public Address(){}

    public Address(String street, String area) {
        this.street = street;

        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

}


