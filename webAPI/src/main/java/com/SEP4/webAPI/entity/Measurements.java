package com.SEP4.webAPI.entity;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "Measurement")
public class Measurements {

    @Id
    @Column(name = "measurementId")
    private int id;
    private String saunaName;
    private int Co2;
    private int humidity;
    private int temperature;
    private Time time;
    @ManyToOne(cascade =CascadeType.ALL)
    private SaunaRoom saunaRoom;


    public Measurements() {
    }

    public Measurements(int id, String saunaName, int co2, int humidity, int temperature, Time time,SaunaRoom saunaRoom) {
        this.id = id;
        this.saunaName = saunaName;
        Co2 = co2;
        this.humidity = humidity;
        this.temperature = temperature;
        this.time = time;
        this.saunaRoom= saunaRoom;
    }
    public SaunaRoom getSaunaRoom() {
        return saunaRoom;
    }

    public void setSaunaRoom(SaunaRoom saunaRoom) {
        this.saunaRoom = saunaRoom;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSaunaName() {
        return saunaName;
    }

    public void setSaunaName(String saunaName) {
        this.saunaName = saunaName;
    }

    public int getCo2() {
        return Co2;
    }

    public void setCo2(int co2) {
        Co2 = co2;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

}

