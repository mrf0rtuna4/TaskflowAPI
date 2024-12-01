package com.taskflow.api.controller;

import com.taskflow.api.entity.Task;
import com.taskflow.api.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @GetMapping("/{id}")
    public Optional<Task> getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }

    @GetMapping("/filter")
    public List<Task> filterTasks(@RequestParam(required = false) Task.TaskStatus status,
                                  @RequestParam(required = false) LocalDate dueDate) {
        if (status != null) {
            return taskService.getTasksByStatus(status);
        } else if (dueDate != null) {
            return taskService.getTasksDueBefore(dueDate);
        }
        return taskService.getAllTasks();
    }
}
