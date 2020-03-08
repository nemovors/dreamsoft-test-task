package nemo.model.dbAccess.DAO;

import nemo.model.entity.User;

import java.util.ArrayList;

public interface UserDAO {

    ArrayList<User> all();
    User getById(int id);

}
