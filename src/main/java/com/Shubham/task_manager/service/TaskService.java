package com.Shubham.task_manager.service;
import java.util.List;
import java.util.ArrayList;
import com.Shubham.task_manager.model.Task;
import com.Shubham.task_manager.repository.TaskRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    public final TaskRepository taskRepository ;
    TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository ;
    }

//    private List <Task> tasks = new ArrayList<>();

//    public List<Task> getAllTasks(){return tasks;}
//    public Task createTask( Task task){tasks.add(task);return task;}

    public List<Task> getAllTasks(){return taskRepository.findAll();}
    public Task createTask(Task task){return taskRepository.save(task);}

}
