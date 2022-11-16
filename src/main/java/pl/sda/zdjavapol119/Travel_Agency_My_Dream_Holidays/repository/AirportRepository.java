package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer> {
    Airport findByName(String name);
}
