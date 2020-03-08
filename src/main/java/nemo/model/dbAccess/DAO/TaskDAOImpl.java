package nemo.model.dbAccess.DAO;

import nemo.model.entity.Task;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TaskDAOImpl implements TaskDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private static Map<Integer, Task> tasks = new HashMap<>();

    @Override
    public List all() {
        //return new ArrayList<Task>(tasks.values());

        Session session = sessionFactory.getCurrentSession();
        System.out.println(session);
        return session.createQuery("from Task").list();
    }

    @Override
    public void add(Task task) {
        tasks.put(task.getTaskId(), task);
    }

    @Override
    public void edit(Task task) {
        tasks.put(task.getTaskId(), task); //TODO: установка исполнителя должна бы проверяться. Но не здесь.
    }

    @Override
    public Task getById(int id) {
        return tasks.get(id);
    }
}
