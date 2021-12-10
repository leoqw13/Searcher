/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.searcher.demo.services;

import com.searcher.demo.entities.Car;
import java.util.List;

/**
 *
 * @author Leonardo
 */

public interface ICarService {
List<Car> findByBrand(String brand);

List<Car> findByModel(String model);

    List<Car> findByPrice(Double price);
}
