package ru.mishucov.Dao;

import ru.mishucov.Model.User;

import java.util.List;

public interface UsersDao {

    void saveUser(User user);

    void removeUserById(int id);

    List<User> getAllUsers();

    User getUserById(int id);

    void updateUser(int id, User user);


}
