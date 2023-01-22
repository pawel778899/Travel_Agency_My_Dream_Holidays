package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Trip;

import java.util.Optional;

public interface TripRepository extends JpaRepository<Trip, Long> {
  ;
    Trip getById(Long id);

}
