package nemo.controller;

import nemo.model.entity.Task;
import nemo.model.dbAccess.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restapi/v0")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(path= "/tasks/{id}")
    public Task getTask(@PathVariable Integer id) {

        return taskService.getById(id);
    }

    @GetMapping(path= "/tasks")
    public List<Task> getTask() {
        return taskService.allTasks();
    }

    @PostMapping(path = "/tasks")
    public boolean createTask(@RequestParam(value="description", required=true) String description) {
       // taskService.add(new Task(1, "des"));
        return true;
    }

    @PatchMapping(path = "/tasks/{id}")
    public boolean assignTask(@PathVariable int id, @RequestParam(value="userid") int userId) {
        return true;
    }
    /*@PatchMapping(path = "/tasks/{id}")
    public Task changeTaskStatus(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return new Task(1, "name");
    }*/
    /*@PatchMapping(path = "/tasks/{id}")
    public boolean updateTask(@RequestParam(value="description", required=false) String description, @RequestParam(value="userid", required=false) Integer userId) {
        System.out.println("запрошен юзер " + userId + " и описание " + description);
        return true;
    }*/
}