package org.system.todo.model;

public class Task {
    private String description;
    private int id;
    private boolean isDone;

    public Task(String description, int id, boolean isDone) {
        this.description = description;
        this.id = id;
        this.isDone = isDone;
    }


    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public int getId() {
        return id;
    }

    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
