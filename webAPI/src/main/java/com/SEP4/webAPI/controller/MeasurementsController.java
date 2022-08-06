package com.SEP4.webAPI.controller;

import com.SEP4.webAPI.entity.Measurements;
import com.SEP4.webAPI.entity.SaunaRoom;
import com.SEP4.webAPI.service.MeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/measurement")
public class MeasurementsController {

    @Autowired
    private final MeasurementService measurementService;


    public MeasurementsController(MeasurementService measurementService) {
        this.measurementService = measurementService;
    }

    @GetMapping({"/getAllMeasurements"})
   private List<Measurements> findAllMeasurements(){
        System.out.println("Showing all measurements list");
        return measurementService.findAllMeasurements();

   }

   @GetMapping({"/getMeasurementById/{id}"})
    private Optional<Measurements> findById(@PathVariable int id){
       System.out.println("Showing measurement with the given id");
        return measurementService.findById(id);
    }

    @GetMapping({"/getMeasurementBySaunaName/{name}"})
    private List<Measurements> getMeasurementsBySaunaName(@PathVariable String name){
        return measurementService.getMeasurementsBySaunaName(name);

    }
    @PostMapping("/add")
    private Measurements saveMeasurement(@RequestBody Measurements measurements){
        System.out.println("Measurement added!!!");
        return measurementService.saveMeasurement(measurements);
    }


    @DeleteMapping
    private void deleteMeasurement(@PathVariable("id") int id){
        measurementService.deleteMeasurement(id);
    }
}
