package nemo.model.dbAccess.service;

import nemo.model.entity.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {

    List<Task> allTasks();
    void add(Task task);
    void edit(Task task);
    Task getById(int id);
}
