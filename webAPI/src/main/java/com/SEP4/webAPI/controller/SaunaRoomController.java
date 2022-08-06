package com.SEP4.webAPI.controller;


import com.SEP4.webAPI.entity.Measurements;
import com.SEP4.webAPI.entity.SaunaRoom;
import com.SEP4.webAPI.service.SaunaRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Sauna")
public class SaunaRoomController {

    @Autowired
    private final SaunaRoomService saunaRoomService;

    public SaunaRoomController(SaunaRoomService saunaRoomService) {
        this.saunaRoomService = saunaRoomService;
    }

    @GetMapping
    public List<SaunaRoom> findAllSaunaRoom(){
        return  saunaRoomService.findAllSaunaRoom();
    }

    @GetMapping("/getSaunaById/{id}")
    public Optional<SaunaRoom> findById(@PathVariable int id){
        return saunaRoomService.findById(id);
    }

    @PostMapping("/post")
   public SaunaRoom saveSaunaRoom(@RequestBody SaunaRoom saunaRoom){
        return saunaRoomService.saveSaunaRoom(saunaRoom);
    }

    @DeleteMapping("/{id}")
    public void deleteSaunaRoom(@PathVariable("id")int id){
        saunaRoomService.deleteSaunaRoom(id);
    }
}
