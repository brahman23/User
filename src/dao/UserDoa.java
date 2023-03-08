package dao;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDoa {


    private List<User> userList =  new ArrayList<>();

    public UserDoa(List<User> userList) {
        this.userList = userList;
    }

    public UserDoa() {
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
