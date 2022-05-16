package com.iie;

import com.iie.pojo.UserCredentials;
import com.iie.pojo.service.Login;
import com.iie.pojo.service.Registration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserCredentials userCredentials = new UserCredentials();
        Scanner credentials = new Scanner(System.in);

        //do registration
        Registration registration = new Registration();
        System.out.println("*WELCOME TO THE REGISTRATION PORTAL*");
        //CAPTURE USERNAME
//        System.out.println("ENTER USERNAME");
        String username = registration.captureUsername(credentials);
        //CAPTURE PASSWORD
//        System.out.println("ENTER PASSWORD");
        String password = registration.capturePassword(credentials);
        //CAPTURE FIRST NAME
        System.out.println("ENTER FIRST NAME");
        String firstName = credentials.next().trim();
        //CAPTURE LAST NAME
        System.out.println("ENTER LAST NAME");
        String lastName = credentials.next().trim();

        userCredentials.setUsername(username);
        userCredentials.setPassword(password);
        userCredentials.setFirstName(firstName);
        userCredentials.setLastName(lastName);

        String registrationResponse = registration.registerUser(userCredentials);
        System.out.println(registrationResponse);
        //do login
        Login login = new Login();
        System.out.println("*WELCOME TO THE LOGIN PAGE*");
        System.out.println("ENTER USERNAME TO LOGIN");
        String loginUsername = credentials.next();

        System.out.println("ENTER PASSWORD TO LOGIN");
        String loginPassword = credentials.next();

        String loginResponse = login.returnLoginStatus(loginUsername, loginPassword, userCredentials);

        System.out.println(loginResponse);
    }
}
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanBan");
        // Prompting the user to choose one of the options
        JOptionPane.showInputDialog(null,"Press 1 to add task" + '\n' +"Press 2 to show report" + '\n' + "Press 3 to quit" );
        
        JOptionPane.showInputDialog(null,"How many tasks would you like to add?");
        String taskNumber = input.nextLine();
        JOptionPane.showInputDialog("enter task name");
        String taskName = input.nextLine();
        JOptionPane.showInputDialog("please enter task status ");
        String taskStatus = input.nextLine();
        
        String taskDescription = input.nextLine();
       
 
JOptionPane.showInputDialog(null, "Please enter task description");
        
JOptionPane.showInputDialog(null, "Enter a task description that is less than 50 characters");
        
JOptionPane.showInputDialog(null, "Coming soon");
        
JOptionPane.showInputDialog("enter developer details");
        String developerDetails = input.nextLine();
        // kho mu vhudzoisa uri a pange first name
        
JOptionPane.showInputDialog("enter first name");
        String firstName = input.nextLine();
        
JOptionPane.showInputDialog("enter your last name");
        String lastName = input.nextLine();
        // kho mu vhudzisa uri a pange task duration
        
JOptionPane.showInputDialog("enter task Duration");
        String taskDuration = input.nextLine();
        // kho mu vhudzisa uri a pange task status
        
JOptionPane.showInputDialog("Enter task status");
        String taskStatus = input.nextLine();
        