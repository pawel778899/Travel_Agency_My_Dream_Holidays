package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.Implementation;

import org.springframework.stereotype.Service;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Client;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.PurchasedTrip;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Trip;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.repository.PurchasedTripRepository;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.PurchaseTripService;

import java.math.BigDecimal;
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

    @Override
    public void save(PurchasedTrip purchasedTrip, Client client, Trip trip) {
        purchasedTrip.setClient(client);
        purchasedTrip.setTrip(trip);
//        calculateAllRequiredCost(purchasedTrip);
        purchasedTripRepository.save(purchasedTrip);


    }
//
//    @Override
//    public void calculateAllRequiredCost(PurchasedTrip purchasedTrip) {
//        purchasedTrip.setTripPrice();
//    }
//
//    public void countPrice(BoughtTour boughtTour) {
//        boughtTour.setPrice(boughtTour.getTour().getMinorPrice().multiply(BigDecimal.valueOf(boughtTour.getChildAmount())).add(boughtTour.getTour().getAdultPrice().multiply(BigDecimal.valueOf(boughtTour.getAdultAmount()))));
//    }
}
