import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myTasks = new ArrayList<>();

        //starts the loop by allowing user to make a first choice
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Please choose an option: \n(1)Add a task. \n(2)Remove a task. \n(3)Update a task. \n(4)List all tasks. \n(0)Exit.");
        int userChoice = input.nextInt();
        input.nextLine();

        // starts loop to continue as long as user choice doesn't equal 0
        while (userChoice!=0) {
            //user choices, at the beginning of the loop so it shows up before prompting another response
            if (userChoice==1)
                addTask();
            if(userChoice==2)
                //remove task
            if(userChoice==3)
                //update task
            if (userChoice==4)
                //view tasks

            System.out.println("\nPlease choose an option: \n(1)Add a task. \n(2)Remove a task. \n(3)Update a task. \n(4)List all tasks. \n(0)Exit.");
            userChoice = input.nextInt();
            input.nextLine();
        }
        //goodbye message :)
        if (userChoice==0)
            System.out.println("\n~ Goodbye! ~");
    }

    static void addTask(Scanner input){
        //creates task name
        System.out.println("What's the task name?");
        String taskName = input.nextLine();

        //retrieves user email
        System.out.println("What's the description of the task?");
        String taskDescription = input.nextLine();

        //retrieves user phone number
        System.out.println("What's the priority of the task?");
        int taskPriority = input.nextInt();
        input.nextLine();

        //creates new task
        Task newTask = new Task(taskName,taskDescription,taskPriority);


    }
}