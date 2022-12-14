package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Airport;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Continent;

public interface ContinentRepository extends JpaRepository<Continent, Integer> {

    Continent findByName(String name);
}
