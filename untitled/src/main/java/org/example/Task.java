package org.example;

import java.time.LocalDate;
import java.util.Date;



// -----------------------------------------------------
// Mini project (1)
// Question: (creating task objects/1)
// Written by: (leen mohammad jaber  2021901051)
// -----------------------------------------------------
public class Task {
    private String TaskName;   //The task name aka description
    private LocalDate Duedate;   //the due date of the task using LocalDate class
    private Boolean Status = false;       // the completion status of the task : if false ->uncompleted , if true->completed



    //We have a constructor : where each task must at first be given a name and a due date
    public Task(String taskName, LocalDate duedate) {
        TaskName = taskName;
        Duedate = duedate;
    }

    public Task(String taskName, LocalDate duedate, Boolean status) {
        TaskName = taskName;
        Duedate = duedate;
        Status = status;
    }

    //the setters and getters to edit and retrieve the main attributes of the task
    public String getTaskName() {
        return TaskName;
    }

    public void setTaskName(String taskName) {
        TaskName = taskName;
    }

    public LocalDate getDuedate() {
        return Duedate;
    }

    public void setDuedate(LocalDate duedate) {
        Duedate = duedate;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }
}
