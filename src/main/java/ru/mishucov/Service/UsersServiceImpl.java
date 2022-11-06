package ru.mishucov.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mishucov.Dao.UsersDao;
import ru.mishucov.Model.User;


import javax.transaction.Transactional;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    private final UsersDao usersdao;

    @Autowired
    public UsersServiceImpl(UsersDao usersDao) {
        this.usersdao = usersDao;
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        usersdao.saveUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return usersdao.getAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return usersdao.getUserById(id);
    }

    @Transactional
    @Override
    public void updateUser(int id, User user) {
        usersdao.updateUser(id, user);
    }

    @Transactional
    public void removeUserById(int id) {
        usersdao.removeUserById(id);
    }

}
