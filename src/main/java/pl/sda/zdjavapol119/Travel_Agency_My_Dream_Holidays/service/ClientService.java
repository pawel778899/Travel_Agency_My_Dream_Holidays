package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service;

import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    List<Client> findAll();

    Optional<Client> getById(Integer id);

    Optional<Client> getByName(String name);

    void save(Client client);

    void delete(Client client);


}
