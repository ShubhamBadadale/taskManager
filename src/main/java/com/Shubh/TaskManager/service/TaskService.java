package com.Shubh.TaskManager.service;

import com.Shubh.TaskManager.model.Task;
import com.Shubh.TaskManager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }
    //create
    public Task createTask(Task task){return taskRepository.save(task);}
    //read all
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }
    //read one by id
    public Task getTaskById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found with ID: " + id));
    }
    //update
    public Task updateTask(Long id , Task updatedtask){
        Task existingTask = getTaskById(id);
        existingTask.setTitle(updatedtask.getTitle());
        existingTask.setCompleted(updatedtask.isCompleted());
        return taskRepository.save(existingTask);
    }
    //delete
    public void deleteTask(Long id){
        Task existingTask = getTaskById(id);
        taskRepository.delete(existingTask);
    }
}
