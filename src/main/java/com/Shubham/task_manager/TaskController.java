package com.Shubham.task_manager;
import com.Shubham.task_manager.service.TaskService;
import com.Shubham.task_manager.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {
    private final TaskService taskService;
    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }
//    private List<Task> tasks = new ArrayList<>();
    @GetMapping("/health")
    public String healthCheck(){
        return "The Task Manager API is running!";
    }
    @GetMapping("/task")
    public List<Task> taskCheck(){
//

        return taskService.getAllTasks();;
    }
    @PostMapping("/task")
    public Task createTask(@RequestBody Task newTask){
//
        return taskService.createTask(newTask);
    }


}
