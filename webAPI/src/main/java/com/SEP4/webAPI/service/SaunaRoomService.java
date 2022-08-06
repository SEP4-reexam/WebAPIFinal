package com.SEP4.webAPI.service;

import com.SEP4.webAPI.entity.Measurements;
import com.SEP4.webAPI.entity.SaunaRoom;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface SaunaRoomService {

    List<SaunaRoom> findAllSaunaRoom();

    Optional<SaunaRoom> findById(int id);

    SaunaRoom saveSaunaRoom(SaunaRoom saunaRoom);

    void deleteSaunaRoom(int id);
}
