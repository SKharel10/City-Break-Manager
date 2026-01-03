package com.example.citybreakmanager.controller;

import com.example.citybreakmanager.model.City;
import com.example.citybreakmanager.service.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/city")
public class CityController {

    private CityService cityService;

    @GetMapping
    public List<City> getAllCities(){
        return cityService.getAllCities();
    }

    @GetMapping("{id}")
    public City getCityById(@PathVariable Integer id){
        return cityService.getCityById(id);
    }

    public void insertCity(City city){
        cityService.insertCity(city);
    }


}
