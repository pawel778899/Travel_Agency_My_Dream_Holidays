package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Trip;

public interface TripRepository extends CrudRepository<Trip, Long> {
}
