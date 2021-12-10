/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.searcher.demo.services.impl;


import com.searcher.demo.entities.Car;
import com.searcher.demo.repositories.CarsRepository;
import com.searcher.demo.services.ICarService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author Leonardo
 */
@Service
public class ModelServiceImpl implements ICarService{

    @Autowired
    private CarsRepository carsRep;
   
    @Override
    public List<Car> findByBrand(String brand){
        return carsRep.findByBrand(brand) ;
    }
    
    @Override
    public List<Car> findByModel(String model){
        return carsRep.findByModel(model) ;
    }
   
    @Override
    public List<Car> findByPrice(Double price){
        return carsRep.findByPrice(price) ;
    }

}
