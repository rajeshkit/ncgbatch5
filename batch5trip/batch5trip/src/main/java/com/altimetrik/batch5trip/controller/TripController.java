package com.altimetrik.batch5trip.controller;

import com.altimetrik.batch5trip.model.Trip;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class TripController {
    @RequestMapping("/")
    @ResponseBody
    public String welcome(){
        return "weeeeerrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr rrrrrrrrrrrrrrrrr dsfsdgsdggg";
    }
    @RequestMapping("/trip")
    @ResponseBody
    public Trip getTrip(){
        return new Trip(100,"Chennai","Manali",30000);
    }
    @RequestMapping("/trips")
    @ResponseBody
    public List<Trip> getAllTrips(){
        Trip t1=new Trip(100,"Chennai","Manali",30000);
        Trip t2=new Trip(102,"dfdf","jkdj",60000);
        Trip t3=new Trip(105,"hjhjj","sdsd",130000);
        return Arrays.asList(t1,t2,t3);
    }
}








