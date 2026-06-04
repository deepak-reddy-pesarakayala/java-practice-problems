package com.preptrack.service;

import com.preptrack.entity.Task;
import com.preptrack.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // Add Task
    public Task addTask(Task task) {
        task.setCompleted(false);
        return taskRepository.save(task);
    }

    // Get All Tasks
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Get Completed Tasks
    public List<Task> getCompletedTasks() {
        return taskRepository.findByCompleted(true);
    }

    // Mark Task Completed
    public Task completeTask(Integer id) {

        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        task.setCompleted(true);

        return taskRepository.save(task);
    }

    // Calculate Progress Percentage
    public double getProgressPercentage() {

        long totalTasks = taskRepository.count();

        if (totalTasks == 0) {
            return 0;
        }

        long completedTasks =
                taskRepository.findByCompleted(true).size();

        return (completedTasks * 100.0) / totalTasks;
    }
}