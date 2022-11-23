package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.Implementation;

import org.springframework.stereotype.Service;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.City;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.repository.CityRepository;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.CityService;

import java.util.List;
@Service
public class CityService_Implementation implements CityService {

    private final CityRepository cityRepository;

    public CityService_Implementation(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }
}
