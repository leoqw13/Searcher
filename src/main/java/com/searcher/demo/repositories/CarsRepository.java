/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.searcher.demo.repositories;

import com.searcher.demo.entities.Car;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Leonardo
 */
@Repository
public interface CarsRepository extends JpaRepository<Car, Long>{
    //search by brand
    List<Car> findByBrand(String brand);
  //search by model
    List<Car> findByModel(String model);
  //search by price
    @Query("FROM Car c WHERE c.price > :price")
    List<Car> findByPrice(@Param("price") Double price);
}
