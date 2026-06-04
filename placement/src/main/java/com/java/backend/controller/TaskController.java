package com.java.backend.controller;
import com.preptrack.entity.Task;
import com.preptrack.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "http://localhost:5173")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // Add Task
    @PostMapping
    public Task addTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    // Get All Tasks
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    // Mark Task Completed
    @PutMapping("/{id}/complete")
    public Task completeTask(@PathVariable Integer id) {
        return taskService.completeTask(id);
    }

    // Get Completed Tasks
    @GetMapping("/completed")
    public List<Task> getCompletedTasks() {
        return taskService.getCompletedTasks();
    }

    // Get Progress Percentage
    @GetMapping("/progress")
    public Map<String, Double> getProgress() {

        double progress = taskService.getProgressPercentage();

        return Map.of("progress", progress);
    }
}