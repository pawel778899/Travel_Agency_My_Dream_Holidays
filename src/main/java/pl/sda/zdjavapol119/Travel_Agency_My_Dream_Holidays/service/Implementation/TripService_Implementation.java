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

        List<Trip> allAvailableTrips = tripRepository
                .findAll()
                .stream()
                .filter(trip -> trip.getPromoted())
                .limit(3)
                .collect(Collectors.toList());
        return allAvailableTrips;
    }

    @Override
    public List<Trip> getThreeClosestTrips() {

        List<Trip> allAvailableTripsSortedByDate = tripRepository
                .findAll()
                .stream()
                .sorted((Comparator.comparing(trip -> trip.getStartDate())))
                .limit(3)
                .collect(Collectors.toList());
        return allAvailableTripsSortedByDate;
    }

    @Override
    public List<Trip> getAllTripList() {
        return tripRepository.findAll();
    }

    @Override
    public Trip getById(Long id) {
        return tripRepository.getById(id);
    }

    //    @Override
//    public List<Trip> getThreeClosestTripsByDateAndByContinent() {
//
//        List<Trip> allAvailableTripsSortedByDate = tripRepository
//                .findAll()
//                .stream()
//                .sorted((Comparator.comparing(trip -> trip.getStartDate())))
//                .parallel()
//                .sorted(Comparator.comparing(trip -> trip.getDestinationContinent().getName()))
//                .limit(4)
//                .collect(Collectors.toList());
//
//
//        return allAvailableTripsSortedByDate;
//    }
    @Override
    public List<Trip> getThreeClosestTripsForEveryContinent() {

        List<Trip> allAvailableTripsSortedByDateAndContinent = tripRepository
                .findAll()
                .stream()
                .sorted((Comparator.comparing(trip -> trip.getStartDate())))
                .sorted((Comparator.comparing(trip -> trip.getDestinationContinent().getName())))
                .collect(Collectors.toList());

        List<Trip> allClosestThreeTripsForEveryContinent = new ArrayList<>();
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;
        int counter7 = 0;

        for (Trip trip : allAvailableTripsSortedByDateAndContinent) {
            if (trip.getDestinationContinent().getName().equals("Africa") && counter1 < 3) {
                allClosestThreeTripsForEveryContinent.add(trip);
                counter1++;
            }
            if (trip.getDestinationContinent().getName().equals("Asia") && counter2 < 3) {
                allClosestThreeTripsForEveryContinent.add(trip);
                counter2++;
            }
            if (trip.getDestinationContinent().getName().equals("Australia") && counter3 < 3) {
                allClosestThreeTripsForEveryContinent.add(trip);
                counter3++;
            }
            if (trip.getDestinationContinent().getName().equals("Europe") && counter4 < 3) {
                allClosestThreeTripsForEveryContinent.add(trip);
                counter4++;
            }
            if (trip.getDestinationContinent().getName().equals("North America") && counter5 < 3) {
                allClosestThreeTripsForEveryContinent.add(trip);
                counter5++;
            }
            if (trip.getDestinationContinent().getName().equals("South America") && counter6 < 3) {
                allClosestThreeTripsForEveryContinent.add(trip);
                counter6++;
            }
            if (trip.getDestinationContinent().getName().equals("Antarctica") && counter7 < 3) {
                allClosestThreeTripsForEveryContinent.add(trip);
                counter7++;
            }
        }
        return allClosestThreeTripsForEveryContinent;
    }
}

