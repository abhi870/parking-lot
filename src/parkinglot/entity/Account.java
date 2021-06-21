package parkinglot.entity;

public abstract class Account {
    private String name;
    private String email;
    private String password;
    private Integer employeeId;
    private Address address;


    public Account(){}
    public Account(String name, String email, String password, Integer employeeId, Address address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.employeeId = employeeId;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
