package br.com.todo.todolist.task;

import java.util.UUID;
import org.springfamework.data.jpa.repository.JpaRepository;

public class ITaskRepository extends JpaRepository<TaskModel, UUID>{

    public Object save(TaskModel taskModel) {
        return null;
    }
    
}
