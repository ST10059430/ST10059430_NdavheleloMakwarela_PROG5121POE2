package com.iie;

import com.iie.pojo.UserCredentials;
import com.iie.service.LoginService;
import com.iie.service.RegistrationService;
import com.iie.utilities.EasyKanbanUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserCredentials userCredentials = new UserCredentials();
        Scanner credentials = new Scanner(System.in);

        //do registration
        RegistrationService registrationService = new RegistrationService();
        RegistrationService.getRegistrationScreen();
        //CAPTURE USERNAME
        String username = registrationService.captureUsername(credentials);
        //CAPTURE PASSWORD
        String password = registrationService.capturePassword(credentials);
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

        String registrationResponse = registrationService.registerUser(userCredentials);
        System.out.println(registrationResponse);

        //do login
        LoginService loginService = new LoginService();

        LoginService.getLoginScreen();

        System.out.println("ENTER USERNAME TO LOGIN");
        String loginUsername = credentials.next();

        System.out.println("ENTER PASSWORD TO LOGIN");
        String loginPassword = credentials.next();

        String loginResponse = loginService.returnLoginStatus(loginUsername, loginPassword, userCredentials);

        System.out.println(loginResponse);

        //TASK2
        int selectedOption = 0;
        do {
            EasyKanbanUtils.showWelcomeScreen();
            selectedOption = credentials.nextInt();

            EasyKanbanUtils.getOptionValueAction(selectedOption, credentials);
        }while (selectedOption != 3);
    }
}
