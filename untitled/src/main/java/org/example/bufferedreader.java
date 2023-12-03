package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
// -----------------------------------------------------
// Mini project (1)
// Question: (The ability to retrieve the old tasks of the user so if the program loads the user would have his old tasks saved/part 1)
// Written by: (Leen mohammad jaber  2021901051)
// -----------------------------------------------------
public class bufferedreader  { //this class allows us to read from a file where we already saved the user's task after the program ends
    // so we can retrieve them when the user comes back

    public ArrayList<Task> Readfromfile (String name) throws IOException {
        BufferedReader br; //created an instance of the buffered reader
        ArrayList<Task> task = new ArrayList<Task>(); //this gives back the array list of the previous tasks so the user can fetch them
        if (name.equals("Leen")){ //if the user name is leen it will read from leen's file and retrive its prev tasks
            br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\java task uni\\Leen.txt"));


        }
        else{ //if the user name is tala it will read from tala's file and retrive its prev tasks
            br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\java task uni\\Tala.txt"));

        }
        while (true){ //while there is a new line to read in the file
            try { //try and catch exceptions to handle if there is no more lines to read
                if (!br.ready()) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            String s = br.readLine(); //read the line
            String[] parts = s.split("\t"); //split it based on \t because the 3 attributes are written with a \t space between them
            String description = parts[0]; // first part is the description/name
            String dueDate = parts[1]; //second part is the duedate
            LocalDate localDate = LocalDate.parse(dueDate); //changed the string to a local date object using parse
            String status = parts[2]; // third part is the status of completion
            boolean stat; //this changes the status from string to bool so we can create an object and store it in the array list
            if(status.equalsIgnoreCase("Completed")){
                stat =true;
            }
            else{
                stat = false;
            }
            //the task thats read from the line in the file
            Task to_add_task = new Task(description , localDate , stat );
            //added the task to the array we will return
            task.add(to_add_task);
        }



        //returned the array that needs to be worked on

        return task;
    }
}
