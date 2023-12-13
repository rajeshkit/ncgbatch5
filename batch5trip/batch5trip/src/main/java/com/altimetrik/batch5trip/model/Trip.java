package com.altimetrik.batch5trip.model;

public class Trip {
    private int tripId;
    private String source;
    private String destination;
    private  int cost;

    public Trip() {
    }

    public Trip(int tripId, String source, String destination, int cost) {
        this.tripId = tripId;
        this.source = source;
        this.destination = destination;
        this.cost = cost;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
