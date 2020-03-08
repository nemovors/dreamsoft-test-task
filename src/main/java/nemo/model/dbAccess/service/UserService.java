package nemo.model.dbAccess.service;

import nemo.model.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface UserService {

    ArrayList<User> allFilms();
    User getById(int id);
    User getByName(String name);
}
