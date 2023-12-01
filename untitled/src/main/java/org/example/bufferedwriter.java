package org.example;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
// -----------------------------------------------------
// Mini project (1)
// Question: (The ability to save the current tasks of the user so even if the program finishes it will be saved/part 1)
// Written by: (Leen mohammad jaber  2021901051)
// -----------------------------------------------------
public class bufferedwriter {

    //This method is made so that the program saves all the tasks so even when the program end the "bufferedreader class can retrieve the older tasks he had saved"
    public void write_in_log(ArrayList<Task> tasks , String name) throws IOException { //it throws an input output exception incase the file is not found
        BufferedWriter bw;
        if(name.equals("Leen")){
            bw = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\java task uni\\Leen.txt" , true));
        }
        else{
            bw = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\java task uni\\Tala.txt" , true));
        }
         //used a buffered reader and a file writer to write in a certain file the tasks of the user

        for(Task item : tasks){ //this loop goes over the Array list that stores the tasks as objects
            boolean status = item.getStatus(); //checks the value of the status if true or false
            String current_status ;
            if(status){ //if the status is true
                current_status = "Completed";
            }
            else{//if the status is false
                current_status = "Uncompleted";
            }
            //this writes inside the file the task and separates them with '\t' so the reader can be able to split using this token
            bw.write(item.getTaskName() + '\t' + item.getDuedate() + '\t' +current_status + '\n');

        }

        bw.close(); // closing the stream of the buffered reader

    }
}
