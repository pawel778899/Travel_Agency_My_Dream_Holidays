package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.City;

public interface CityRepository extends JpaRepository<City,Integer> {

    City findByName(String name);
}
