package com.Shubham.task_manager;

import com.Shubham.task_manager.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {
    private List<Task> tasks = new ArrayList<>();
    @GetMapping("/health")
    public String healthCheck(){
        return "The Task Manager API is running!";
    }
    @GetMapping("/task")
    public List<Task> taskCheck(){
//        Task t1 = new Task(10l , "Title1" , true);
//        tasks.add(t1);
        return tasks;
    }
    @PostMapping("/task")
    public Task createTask(@RequestBody Task newTask){
//        Task t1 = new Task(10l , "Title1" , true);
        tasks.add(newTask);
        return newTask;
    }


}
