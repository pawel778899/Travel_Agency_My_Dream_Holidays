package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.service;

import pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model.User;

import java.util.List;

public interface UserService {


    List<User> findAll();

    void deleteById(Long id);


}
