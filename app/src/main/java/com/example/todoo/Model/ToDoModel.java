package com.example.todoo.Model;

public class ToDoModel {

    private String task;
    private String desc; // New property for task description
    private int id, status;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    // Getter and setter for task description
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
