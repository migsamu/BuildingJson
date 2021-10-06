package org.iesfm.building;

import java.util.List;
import java.util.Objects;

public class Building {

    private String address;
    private String city;
    private List<Apartment> apartments;

    public Building(){

    }

    public Building(String address, String city, List<Apartment> apartments) {
        this.address = address;
        this.city = city;
        this.apartments = apartments;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(List<Apartment> apartments) {
        this.apartments = apartments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(address, building.address) && Objects.equals(city, building.city) && Objects.equals(apartments, building.apartments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, city, apartments);
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", apartments=" + apartments +
                '}';
    }
}
