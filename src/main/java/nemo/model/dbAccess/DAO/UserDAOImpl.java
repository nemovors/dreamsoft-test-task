package nemo.model.dbAccess.DAO;

import nemo.model.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDAOImpl implements UserDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private static Map<Integer, User> users = new HashMap<>();

    public UserDAOImpl() {
    }

    @Override
    public ArrayList<User> all() {
        return new ArrayList<User>(users.values());
    }

    @Override
    public User getById(int id) {
        return users.get(id);
    }


}
