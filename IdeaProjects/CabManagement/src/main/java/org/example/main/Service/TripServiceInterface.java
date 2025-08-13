package org.example.Service;
import org.example.Entity.Trip;

import java.util.List;

public interface TripServiceInterface {

    public Trip saveTrip(Trip trip);

    public List<Trip> getAllTrip();

    public void deleteTrip(Long id);

    public void deleteAllTrip();
}
