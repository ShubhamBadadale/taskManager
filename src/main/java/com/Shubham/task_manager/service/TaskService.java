package com.Shubham.task_manager.service;
import java.util.List;
import java.util.ArrayList;
import com.Shubham.task_manager.model.Task;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    private List <Task> tasks = new ArrayList<>();

    public List<Task> getAllTasks(){return tasks;}
    public Task createTask( Task task){tasks.add(task);return task;}
}
