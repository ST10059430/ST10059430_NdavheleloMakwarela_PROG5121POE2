package com.iie.service;

import com.iie.pojo.UserCredentials;

import javax.swing.*;
import java.util.Scanner;

public class RegistrationService {
    public String registerUser(UserCredentials userCredentials){
        String response = "";
        if (!checkUsername(userCredentials.getUsername()) && !checkPasswordComplexity(userCredentials.getPassword())) {
            response = "The username is incorrectly formatted and the password does not meet the complexity requirements";
        } else if (!checkUsername(userCredentials.getUsername())) {
            response = "The username is incorrectly formatted";
        } else if (!checkPasswordComplexity(userCredentials.getPassword())) {
            response = "The password does not meet the complexity requirements";
        }else {
            response = "The two above conditions have been met and the user registered successfully";
        }

        return response;
    }

    public String captureUsername(Scanner scanner) {
        boolean correctUsername = false;

        String username;
        do {
            System.out.println("ENTER USERNAME");
            username = scanner.next().trim();

            if (!checkUsername(username)) {
                System.out.println("Username is not correctly formatted, " +
                        "please ensure that your username contains an underscore and is not more than 5 character in length.");
            }else {
                correctUsername = true;
                System.out.println("Username successfully captured");
            }
        } while (!correctUsername);

        return username;
    }

    public String capturePassword(Scanner scanner) {
        String password;
        boolean correctPassword = false;

        do {
            System.out.println("ENTER PASSWORD");
            password = scanner.next().trim();

            if (!checkPasswordComplexity(password)) {
                System.out.println("Password is not correctly formatted, " +
                        "please ensure that your password contains at least 8 characters, a capital letter, a number, and a special character");
            }else {
                correctPassword = true;
                System.out.println("Password successfully captured");
            }
        } while (!correctPassword);

        return password;
    }

    private boolean checkUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    private boolean checkPasswordComplexity(String password) {
        //to-do implement correct logic
        return true;
    }

    public static void getRegistrationScreen() {
        System.out.println("************************************");
        System.out.println("*WELCOME TO THE REGISTRATION PORTAL*");
        System.out.println("************************************");
    }

}
