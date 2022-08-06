package com.SEP4.webAPI.service.impl;

import com.SEP4.webAPI.entity.Measurements;
import com.SEP4.webAPI.entity.SaunaRoom;
import com.SEP4.webAPI.repository.MeasurementRepository;
import com.SEP4.webAPI.repository.SaunaRoomRepository;
import com.SEP4.webAPI.service.SaunaRoomService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaunaRoomServiceImpl implements SaunaRoomService {
    private final SaunaRoomRepository saunaRoomRepository;
    private final MeasurementRepository measurementRepository;


    public SaunaRoomServiceImpl(SaunaRoomRepository saunaRoomRepository, MeasurementRepository measurementRepository) {
        this.saunaRoomRepository = saunaRoomRepository;
        this.measurementRepository = measurementRepository;
    }

    @Override
    public List<SaunaRoom> findAllSaunaRoom() {
        return saunaRoomRepository.findAll();
    }

    @Override
    public Optional<SaunaRoom> findById(int id) {
        return saunaRoomRepository.findById(id);
    }

    @Override
    public SaunaRoom saveSaunaRoom(SaunaRoom saunaRoom) {
        return saunaRoomRepository.save(saunaRoom);
    }



    @Override
    public void deleteSaunaRoom(int id) {
        saunaRoomRepository.deleteById(id);
    }
}
