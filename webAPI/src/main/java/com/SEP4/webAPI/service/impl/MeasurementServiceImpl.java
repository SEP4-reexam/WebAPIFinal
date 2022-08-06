package com.SEP4.webAPI.service.impl;

import com.SEP4.webAPI.entity.Measurements;
import com.SEP4.webAPI.entity.SaunaRoom;
import com.SEP4.webAPI.repository.MeasurementRepository;
import com.SEP4.webAPI.service.MeasurementService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MeasurementServiceImpl implements MeasurementService {

    private final MeasurementRepository measurementRepository;

    public MeasurementServiceImpl(MeasurementRepository measurementRepository) {
        this.measurementRepository = measurementRepository;
    }

    @Override
    public List<Measurements> findAllMeasurements() {
        return measurementRepository.findAll();
    }

    @Override
    public Optional<Measurements> findById(int id) {
        return measurementRepository.findById(id);
    }

    @Override
    public List<Measurements> getMeasurementsBySaunaName(String name) {
        return measurementRepository.findBySaunaName(name);
    }

    @Override
    public Measurements saveMeasurement(Measurements measurements) {
        return measurementRepository.save(measurements);
    }

    @Override
    public void deleteMeasurement(int id) {
        measurementRepository.deleteById(id);
    }
}
