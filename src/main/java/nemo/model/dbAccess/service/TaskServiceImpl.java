package nemo.model.dbAccess.service;

import nemo.model.entity.Task;
import nemo.model.dbAccess.DAO.TaskDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskDAO taskDAO;

    @Autowired
    public void setTaskDAO(TaskDAO taskDAO) {
        this.taskDAO = taskDAO;
    }

    @Override
    @Transactional
    public List<Task> allTasks() {
        return taskDAO.all();
    }

    @Override
    public void add(Task task) {
        taskDAO.add(task);
    }

    @Override
    public void edit(Task task) {
        taskDAO.edit(task); //TODO: сюда логику добавить
    }

    @Override
    public Task getById(int id) {
        return taskDAO.getById(id);
    }
}
