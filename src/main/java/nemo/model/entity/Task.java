package nemo.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String description;
    @Column
    private TaskStatus status;
    @Column
    //@ManyToOne
    //@JoinColumn(name="id")
    private int executor; //id исполнителя

    public Task(int id, String description, TaskStatus status, int executor) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.executor = executor;
    }

    public Task() {
    }

    public int getTaskId() {
        return id;
    }

    public void setTaskId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public int getExecutor() {
        return executor;
    }

    public void setExecutor(int executor) {
        this.executor = executor;
    }

    public String toString() {
        return new String("id=" + id + ", description=" + description);
    }
}
