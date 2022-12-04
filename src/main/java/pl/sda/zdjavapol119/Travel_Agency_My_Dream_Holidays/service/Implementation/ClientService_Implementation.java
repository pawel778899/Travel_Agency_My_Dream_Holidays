package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.Implementation;

import org.springframework.stereotype.Service;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.Client;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.repository.ClientRepository;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.ClientService;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService_Implementation implements ClientService {

    private final ClientRepository clientRepository;

    public ClientService_Implementation(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void setClientName(Client client, String name){
        client.setName(name);
    }

    public void setClientSurname(Client client, String surname){
        client.setSurname(surname);
    }

    public void setClientEmail(Client client, String email){
        client.setEmail(email);
    }




    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> getById(Integer id) {
        return clientRepository.findById(id); /// ????
    }

    @Override
    public Client getByName(String name) {
        return clientRepository.findByName(name);
    }

    @Override
    public void save(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void delete(Client client) {
        clientRepository.delete(client);
    }
}
