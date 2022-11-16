package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.Implementation;

import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Airport;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.repository.AirportRepository;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.AirportService;

import java.util.List;

public class AirportService_Implementation implements AirportService {

    private final AirportRepository airportRepository;

    public AirportService_Implementation(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    @Override
    public List<Airport> findAll() {
        return airportRepository.findAll();
    }
}
