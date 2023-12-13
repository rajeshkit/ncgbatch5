package com.altimetrik.tms.service;

import com.altimetrik.tms.model.Trip;
import com.altimetrik.tms.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TripServiceImpl implements TripService {
    @Autowired
    private TripRepository tripRepository;

    public Trip createTrip(Trip t){
        System.out.println("In Trip Service");
        System.out.println(t);
        return tripRepository.save(t);
    }
}
