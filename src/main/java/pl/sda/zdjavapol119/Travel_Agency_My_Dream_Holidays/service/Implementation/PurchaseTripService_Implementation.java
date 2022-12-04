package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.Implementation;

import org.springframework.stereotype.Service;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.PurchasedTrip;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.repository.PurchasedTripRepository;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.PurchaseTripService;

import java.util.List;

@Service
public class PurchaseTripService_Implementation implements PurchaseTripService {

    private final PurchasedTripRepository purchasedTripRepository;

    public PurchaseTripService_Implementation(PurchasedTripRepository purchasedTripRepository) {
        this.purchasedTripRepository = purchasedTripRepository;
    }

    @Override
    public List<PurchasedTrip> findAll() {
        return purchasedTripRepository.findAll();
    }
}
