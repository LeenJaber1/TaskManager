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
public class bufferedreader  {

    public ArrayList<Task> Readfromfile (String name) throws IOException {
        BufferedReader br;
        ArrayList<Task> task = new ArrayList<Task>();
        if (name.equals("Leen")){
            br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\java task uni\\Leen.txt"));


        }
        else{
            br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\java task uni\\Tala.txt"));

        }
        while (true){
            try {
                if (!br.ready()) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            String s = br.readLine();
            String[] parts = s.split("\t");
            String description = parts[0];
            String dueDate = parts[1];
            LocalDate localDate = LocalDate.parse(dueDate);
            String status = parts[2];
            boolean stat;
            if(status.equalsIgnoreCase("Completed")){
                stat =true;
            }
            else{
                stat = false;
            }
            Task to_add_task = new Task(description , localDate , stat );
            task.add(to_add_task);
        }




        return task;
    }
}
