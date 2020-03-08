package nemo.model.entity;

import javax.persistence.Entity;

@Entity
public enum TaskStatus {
    OPEN, //новая задача
    WORK, //в работе - назначена исполнителю
    DONE //завершена
}
