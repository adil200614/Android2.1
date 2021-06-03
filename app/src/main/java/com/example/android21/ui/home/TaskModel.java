package com.example.android21.ui.home;

import java.io.Serializable;

public class TaskModel implements Serializable {
     String title, description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskModel(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
