package service.impl;

import dao.UserDoa;
import exeption.MyExeption;
import model.User;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

      UserDoa userDoa = new UserDoa();


    @Override
    public void add(User user){
        try {
            if (user != null) {
                    userDoa.getUserList().add(user);
            } else
                    System.out.println("user is null");

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public User findById(Long id) throws MyExeption {
        try {
            for (User u:userDoa.getUserList()) {
                if(u.getId().equals(id)){
                    return u;
                }
            }
        }catch (RuntimeException e){
            throw new MyExeption();
        }
        return null;
    }

    @Override
    public List<User> getAll() throws MyExeption {
        try {
           return userDoa.getUserList();
        }catch (Exception e){
            throw new MyExeption();
        }


    }

    @Override
    public void deleteById(Long id) throws MyExeption {
        try {
            for (User u:userDoa.getUserList()) {
                if(u.getId().equals(id)){
                    userDoa.getUserList().remove(u);
                }
            }



        }catch (Exception e){
            throw new MyExeption();
        }

    }
}
