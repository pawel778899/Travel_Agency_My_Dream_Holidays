package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.Implementation;

import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Trip;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.repository.TripRepository;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.TripService;

import java.util.List;

public class TripService_Implementation implements TripService {

    private final TripRepository tripRepository;

    public TripService_Implementation(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    @Override
    public List<Trip> get3PromotedTrips() {
        return null;
    }

    @Override
    public List<Trip> get3ComingTrips() {
        return null;
    }

    @Override
    public List<Trip> getAllTripList() {
        return tripRepository.findAll();
    }
}
