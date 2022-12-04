package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.Implementation;

import org.springframework.stereotype.Service;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.User;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.repository.UserRepository;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service.UserService;

import java.util.List;

@Service
public class UserService_Implementation implements UserService {

private final UserRepository userRepository;

    public UserService_Implementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
