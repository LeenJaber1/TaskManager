package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
// -----------------------------------------------------
// Mini project (1)
// Question: (The abiltity to sort tasks based on completetion status /5)
// Written by: (Leen mohammad jaber  2021901051)
// -----------------------------------------------------
public class SortByCompletetionStatus {//this class sorts the tasks based on Completion status

    public void sortByStatus(ArrayList<Task> tasks){ //it takes the array that needs to be sorted
        Collections.sort(tasks, new Comparator<Task>() {//it calls the sort from collections library and uses comparator to compare each two tasks
            @Override  //this overrides the compare method to compare based on Completion status
            public int compare(Task task1, Task task2) {
                return task1.getStatus().compareTo(task2.getStatus());
            }
        });
    }
}
