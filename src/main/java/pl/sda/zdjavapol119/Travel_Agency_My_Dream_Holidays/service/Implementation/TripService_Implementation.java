package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.Implementation;

import org.springframework.stereotype.Service;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Trip;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.repository.TripRepository;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.TripService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TripService_Implementation implements TripService {

    private final TripRepository tripRepository;

    public TripService_Implementation(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    @Override
    public List<Trip> getThreePromotedTrips() {

        List<Trip> allAvailableTrips = tripRepository.findAll();
        List<Trip> allPromotedTrips = new ArrayList<>();

        int promotedTripsCounter = 0;
        for (Trip trip : allAvailableTrips) {
            if (promotedTripsCounter < 3 && trip.getPromoted()) {
                allPromotedTrips.add(trip);
                promotedTripsCounter++;
            }
        }
        return allPromotedTrips;
    }

    @Override
    public List<Trip> getThreeClosestTrips() {

        List<Trip> allAvailableTripsSortedByDate = tripRepository
                .findAll()
                .stream()
                .sorted((Comparator.comparing(trip -> trip.getStartDate())))
                .collect(Collectors.toList());

        List<Trip> closestTrips = new ArrayList<>();
        int closestTripsCounter = 0;

        for (Trip trip : allAvailableTripsSortedByDate) {
            if (closestTripsCounter < 3) {
                closestTrips.add(trip);
                closestTripsCounter++;
            }
        }
        return closestTrips;
    }

    @Override
    public List<Trip> getAllTripList() {
        return tripRepository.findAll();
    }

    @Override
    public Trip getById(Long id) {
        return tripRepository.getById(id);
    }


}
