package com.SEP4.webAPI.service;

import com.SEP4.webAPI.entity.Measurements;
import com.SEP4.webAPI.entity.SaunaRoom;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface MeasurementService {
    List<Measurements> findAllMeasurements();

    Optional<Measurements> findById(int id);
    List<Measurements> getMeasurementsBySaunaName(String name);
    Measurements saveMeasurement(Measurements measurements);
    void deleteMeasurement(int id);
}
