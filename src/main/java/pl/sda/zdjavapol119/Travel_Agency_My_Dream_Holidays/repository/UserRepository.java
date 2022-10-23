package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
