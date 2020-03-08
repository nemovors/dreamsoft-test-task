package nemo.model.dbAccess.DAO;

import nemo.model.entity.Task;

import java.util.List;

public interface TaskDAO {

    List all();
    void add(Task task);
    void edit(Task task);
    Task getById(int id);
}
