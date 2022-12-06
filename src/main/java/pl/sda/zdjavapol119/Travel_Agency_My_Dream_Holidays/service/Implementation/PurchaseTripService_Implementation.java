package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.Implementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Client;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.PurchasedTrip;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Trip;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.repository.PurchasedTripRepository;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.PurchaseTripService;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
@Primary
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

    @Override
    public void save(PurchasedTrip purchasedTrip, Client client, Trip trip) {
        purchasedTrip.setClient(client);
        purchasedTrip.setTrip(trip);
        calculateAllRequiredCost(purchasedTrip);
        purchasedTripRepository.save(purchasedTrip);

    }

    @Override
    public void calculateAllRequiredCost(PurchasedTrip purchasedTrip) {
        purchasedTrip.setTripPrice(purchasedTrip.getTrip().getChildPrice().multiply(BigDecimal.valueOf(purchasedTrip.getNumberPlacesChildrenPurchased())).add(purchasedTrip.getTrip().getAdultPrice().multiply(BigDecimal.valueOf(purchasedTrip.getNumberPlacesAdultsPurchased()))));
    }

}
