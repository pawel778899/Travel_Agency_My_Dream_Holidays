package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Trip;

public interface TripRepository extends JpaRepository<Trip, Integer> {

    //long ?

    //findAllToursByDurationTime
    //findAllToursByDestinationCity
    //findAllToursByOriginCity
    //updatePromotionById
    //??????????????????????????????????????????
}
