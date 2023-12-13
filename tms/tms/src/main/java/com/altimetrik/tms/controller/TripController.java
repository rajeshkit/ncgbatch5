package com.altimetrik.tms.controller;

import com.altimetrik.tms.model.Trip;
import com.altimetrik.tms.service.TripService;
import com.altimetrik.tms.service.TripServiceImpl;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@Validated
public class TripController {
    private TripService tripService;
    @Autowired
    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @RequestMapping(value="/trip",method = RequestMethod.POST) //create a trip resource
    @ResponseBody
    public Trip makeTrip(@RequestBody @Valid Trip trip){
        System.out.println("post request working");
        System.out.println(trip);
        return tripService.createTrip(trip);
    }
    @RequestMapping(value="/trip/{id}",method = RequestMethod.DELETE) //create a trip resource
    @ResponseBody
    public String makeTrip1(@PathVariable("id") @NotNull String id){
        return id;
    }
    @RequestMapping(value="/trip",method = RequestMethod.GET) //create a trip resource
    @ResponseBody
    public int makeTrip2(@RequestParam("id") int id){
        return id;
    }
}








