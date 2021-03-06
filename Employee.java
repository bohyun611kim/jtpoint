package com.javatpoint.si;

public class Employee {

    private int id;
    private String name;
    private String city;
    private  Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void displayInfo() {
        System.out.println(id + " " + name + " " + city);
        System.out.println(address);
    }
}
