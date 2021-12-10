
package com.searcher.demo.controller;

import com.searcher.demo.entities.Car;
import com.searcher.demo.services.ICarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Leonardo
 */
@Controller
public class CarsController {
    @Autowired
    private ICarService CarServ;
    
    @GetMapping("/brandform")
    public String brandsform(Model modl){
        modl.addAttribute("car", new Car());
        return "brandform";
    }
    @GetMapping("/brand")
    public String findByBrand(Model modl,@ModelAttribute("car") Car car,@RequestParam String brand){
        modl.addAttribute("carByBrand",CarServ.findByBrand(brand));
        return "brandform";
    }
    
    @GetMapping("/modelform")
    public String modelsform(Model modl){
        modl.addAttribute("car", new Car());
        return "modelform";
    }
    @GetMapping("/model")
    public String findByModel(Model modl,@ModelAttribute("car") Car car,@RequestParam String model){
        modl.addAttribute("carBymodel",CarServ.findByModel(model));
        return "modelform";
    }
    
    @GetMapping("/priceform")
    public String priceform(Model modl){
        modl.addAttribute("car", new Car());
        return "priceform";
    }
    @GetMapping("/price")
    public String findByPriceRange(Model modl,@ModelAttribute("car") Car car,@RequestParam(value = "price", required= false)Double price ){
        modl.addAttribute("carBymodel",CarServ.findByPrice(price));
        return "priceform";
    }
}
