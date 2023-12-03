package org.example;

import org.ietf.jgss.GSSName;

import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

// -----------------------------------------------------
// Mini project (include number)
// Question: (include question/part number)
// Written by: (include your name and student ID)
// -----------------------------------------------------
public class TaskManager {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        bufferedreader br = new bufferedreader();
        ArrayList<Task> tasks;
        System.out.println("Hello! Write your name to Log in: ");
        String userName = scanner.nextLine();
        if(userName.equalsIgnoreCase("Leen")){
            tasks = br.Readfromfile("Leen");
        }
        else{
            tasks = br.Readfromfile("Tala");
        }
        System.out.println("Welcome" + userName);
        if(tasks.isEmpty()){
            System.out.println("Looks like you have no current task!");
        }
        else{
            //display tasks tala
        }




        bufferedwriter bw = new bufferedwriter();
        bw.write_in_log(tasks , userName);








    }
}
