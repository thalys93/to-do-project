package org.system.todo.service;

import org.system.todo.model.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskService {
    private final List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public Task addTask(String description) {
        Task task = new Task(description, nextId++, false);
        tasks.add(task);
        return task;
    }
    public boolean deleteTask(int id) {
        return tasks.removeIf(task -> task.getId() == id);
    }

    public boolean updateTask(int id, String description) {
        for (Task task: tasks) {
            if(task.getId() == id) {
                task.setDescription(description);
                return true;
            }
        }
        return false;
    };

    public boolean completeTask(int id) {
        for (Task task: tasks) {
            if(task.getId() == id) {
                task.setDone(true);
                return true;
            }
        }
        return false;
    }

    public List<Task> listTasks() {
        return tasks.isEmpty() ? Collections.emptyList() : tasks;
    };
}