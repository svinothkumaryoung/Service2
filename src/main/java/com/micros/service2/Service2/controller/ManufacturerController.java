package com.micros.service2.Service2.controller;

import com.micros.service2.Service2.entity.AcknowledgementClass;
import com.micros.service2.Service2.entity.Manufactuer;
import com.micros.service2.Service2.services.ManufacturerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;

@RestController
@RequestMapping("/manufactuer")
public class ManufacturerController {

    @Autowired
    ManufacturerServices manufacturerServices;

    @PostMapping("/addManu")
    public Manufactuer addManufacturer(@RequestBody Manufactuer manu)
    {
        return manufacturerServices.addProduct(manu);
    }

    @GetMapping("/manu/{id}")
    public AcknowledgementClass getManuDetails(@PathVariable Integer id)
    {
        return manufacturerServices.getManuDetails(id);

    }
}
