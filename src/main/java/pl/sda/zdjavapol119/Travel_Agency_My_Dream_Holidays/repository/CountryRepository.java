package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Airport;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

    Country findByName(String name);
}
