package org.example.Entity;

import jdk.Exported;

import javax.persistence.*;

@Entity
@Table(name = "Cab")
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "RegisterationNumber",nullable = false)
    private String registeration_number;
    @Column(name = "Model")
    private String model;
    @Column(name = "Manufacturer")
    private String manufacturer;
    @Column(name = "Capacity")
    private int capacity;
    @Column(name = "FuelType")
    private String fuel_type;
    @Column(name = "Status")
    private String status;

    /*@ManyToOne
    @JoinColumn(name = "DriverId")
    private Driver driver;*/

    public Cab() {}

    public Long getCabId() {
        return id;
    }
    public void setCabId() {
        this.id = id;
    }

    public String getRegisteration_number() {
        return registeration_number;
    }

    public void setRegisteration_number() {
        this.registeration_number = registeration_number;
    }

    public String getModel() {
        return model;
    }

    public void setModel() {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer() {
        this.manufacturer = manufacturer;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity() {
        this.capacity = capacity;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type() {
        this.fuel_type = fuel_type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus() {
        this.status = status;
    }
}
