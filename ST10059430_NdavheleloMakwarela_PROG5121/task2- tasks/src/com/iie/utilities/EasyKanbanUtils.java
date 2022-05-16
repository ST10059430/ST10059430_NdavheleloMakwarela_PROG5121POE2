package com.iie.utilities;

import com.iie.service.TaskService;

import java.util.Scanner;

public class EasyKanbanUtils {
    public static void getOptionValueAction(int option, Scanner scanner) {
        switch (option) {
            case 1 :
                TaskService taskService = new TaskService();
                taskService.addTask(scanner);
                break;

            case 2 :
                System.out.println("COMING SOON!!!");
                break;

            case 3 :
                System.exit(1);
                break;

            default:
                System.out.println("OPTION SELECTED NOT APPLICABLE");
        }
    }

    public static void showWelcomeScreen() {
        System.out.println("*WELCOME TO EASYKANBAN*");
        

        System.out.println("SELECT YOUR ACTION : ");
        System.out.println("OPTION 1 : ADD TASK");
        System.out.println("OPTION 2 : SHOW REPORT");
        System.out.println("OPTION 3 : QUIT");
    }
}
