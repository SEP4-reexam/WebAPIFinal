package com.SEP4.webAPI.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Sauna")
public class SaunaRoom {

    @Id
    @Column(name = "saunaId")
    private int Id;
    @Column(name = "Name")
    private String SaunaName;
    private int maxCo2;
    private int minCo2;
    private int maxHumidity;
    private int minHumidity;
    private int maxTemperature;
    private int minTemperature;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "saunaRoom")
    private List<Measurements> measurementsList ;


    public SaunaRoom() {
    }

    public SaunaRoom(int id, String saunaName, int maxCo2, int minCo2, int maxHumidity, int minHumidity, int maxTemperature, int minTemperature) {
        Id = id;
        SaunaName = saunaName;
        this.maxCo2 = maxCo2;
        this.minCo2 = minCo2;
        this.maxHumidity = maxHumidity;
        this.minHumidity = minHumidity;
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getSaunaName() {
        return SaunaName;
    }

    public void setSaunaName(String saunaName) {
        SaunaName = saunaName;
    }

    public int getMaxCo2() {
        return maxCo2;
    }

    public void setMaxCo2(int maxCo2) {
        this.maxCo2 = maxCo2;
    }

    public int getMinCo2() {
        return minCo2;
    }

    public void setMinCo2(int minCo2) {
        this.minCo2 = minCo2;
    }

    public int getMaxHumidity() {
        return maxHumidity;
    }

    public void setMaxHumidity(int maxHumidity) {
        this.maxHumidity = maxHumidity;
    }

    public int getMinHumidity() {
        return minHumidity;
    }

    public void setMinHumidity(int minHumidity) {
        this.minHumidity = minHumidity;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public List<Measurements> getMeasurementsList() {
        return measurementsList;
    }

    public void setMeasurementsList(List<Measurements> measurementsList) {
        this.measurementsList = measurementsList;
    }

}
