package nemo.model.dbAccess.service;

import nemo.model.entity.User;
import nemo.model.dbAccess.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public ArrayList<User> allFilms() {
        return userDAO.all();
    }

    @Override
    public User getById(int id) {
        return userDAO.getById(id);
    }

    @Override
    public User getByName(String name) throws NullPointerException { //TODO: сменить ексепшн на нормальный
        for (int i = 0; i < userDAO.all().size(); i++) {
            if (name.equals(userDAO.all().get(i).getName())) {
                return userDAO.all().get(i);
            }
        }
        return null;
    }
}

