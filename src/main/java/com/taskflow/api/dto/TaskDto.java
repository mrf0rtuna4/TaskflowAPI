package com.taskflow.api.dto;

import com.taskflow.api.entity.Task.TaskStatus;
import java.time.LocalDate;

public class TaskDto {

    private String title;
    private String description;
    private TaskStatus status;
    private LocalDate dueDate;

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public TaskStatus getStatus() { return status; }

    public void setStatus(TaskStatus status) { this.status = status; }

    public LocalDate getDueDate() { return dueDate; }

    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
}
