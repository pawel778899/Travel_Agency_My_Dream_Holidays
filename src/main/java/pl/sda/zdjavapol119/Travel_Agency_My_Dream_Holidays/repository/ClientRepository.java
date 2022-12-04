package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    Client findByName(String name);
}
