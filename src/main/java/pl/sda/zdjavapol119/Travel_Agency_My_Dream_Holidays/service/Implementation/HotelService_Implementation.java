package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.Implementation;

import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Hotel;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.repository.HotelRepository;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.HotelService;

import java.util.List;

public class HotelService_Implementation implements HotelService {

    private final HotelRepository hotelRepository;

    public HotelService_Implementation(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<Hotel> findAll() {
        return hotelRepository.findAll();
    }
}
