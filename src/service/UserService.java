package service;

import exeption.MyExeption;
import model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    User findById(Long id) throws MyExeption;
    List<User> getAll() throws MyExeption;
    void deleteById(Long id) throws MyExeption;


}
