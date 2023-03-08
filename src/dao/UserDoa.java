package dao;

import model.User;

import java.util.List;

public class DataBase {
    private List<User> userList;

    public DataBase(List<User> userList) {
        this.userList = userList;
    }

    public DataBase() {
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
