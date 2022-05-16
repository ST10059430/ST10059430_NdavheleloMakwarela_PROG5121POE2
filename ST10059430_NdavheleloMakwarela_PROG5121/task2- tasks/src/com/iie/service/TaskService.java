package com.iie.service;

import com.iie.enums.TaskStatus;
import com.iie.pojo.DeveloperDetails;
import com.iie.pojo.Task;
import com.iie.pojo.UserCredentials;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskService {
    public void addTask(Scanner scanner){

        ArrayList<Task> tasks = new ArrayList<>();
        System.out.println("ENTER NUMBER OF TASKS TO ADD");
        int numOfTask = scanner.nextInt();

        for (int i = 0; i < numOfTask; i++) {
            System.out.println("ENTER TASK NAME");
            String taskName = scanner.next().trim();

            String taskDescription = "";
            do {
                System.out.println("ENTER TASK DESCRIPTION");
                taskDescription = scanner.next().trim();

                if (taskDescription.length() >= 50) {
                    System.out.println("Please enter a task description of less than 50 characters");
                }

            } while (taskDescription.length() >= 50);
            System.out.println("Task description successfully captured");

            DeveloperDetails developerDetails = new DeveloperDetails();

            System.out.println("ENTER DEVELOPER DETAILS");
            System.out.println("ENTER FIRST NAME");
            String fName = scanner.next().trim();
            System.out.println("ENTER LAST NAME");
            String lName = scanner.next().trim();

            developerDetails.setFirstName(fName);
            developerDetails.setLastName(lName);

            System.out.println("ENTER TASK DURATION");
            int taskDuration = scanner.nextInt();

            System.out.println("ENTER TASK STATUS");
            TaskStatus taskStatus = TaskStatus.valueOf(scanner.next().trim().toUpperCase());

            int taskNumber = i + 1;

            String taskId = taskName.substring(0, 2) + ":" + taskNumber + ":" + lName.substring(lName.length() - 3).toUpperCase();

            Task task = new Task();
            task.setTaskName(taskName);
            task.setTaskDescription(taskDescription);
            task.setTaskDuration(taskDuration);
            task.setTaskStatus(taskStatus.name());
            task.setDeveloperDetails(developerDetails);
            task.setTaskNumber(taskNumber);
            task.setTaskId(taskId);

            System.out.println(task);
            tasks.add(task);
        }

        int totNumberOfHours = 0;
        for (Task tsk : tasks) {
            System.out.println("**************TASK " + tsk.getTaskNumber() + " **************");
            System.out.println(tsk);
            System.out.println("************** END OF  TASK " + tsk.getTaskNumber() + " **************\n");

            totNumberOfHours = totNumberOfHours + tsk.getTaskDuration();
        }

        System.out.println("TOTAL NUMBER OF HOURS : " + totNumberOfHours + "\n");
    }
}

