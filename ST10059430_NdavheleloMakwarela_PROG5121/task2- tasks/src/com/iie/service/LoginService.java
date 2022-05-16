package com.iie.service;

import com.iie.pojo.UserCredentials;

public class LoginService {
    private boolean loginUser(String username, String password, UserCredentials registeredUser) {
        return registeredUser.getUsername().equals(username) && registeredUser.getPassword().equals(password);
    }

    public String returnLoginStatus(String loginUser,String loginPassword, UserCredentials registeredUser) {
        if (loginUser(loginUser, loginPassword, registeredUser)) {
            return "Welcome " + registeredUser.getFirstName() + ", " + registeredUser.getLastName() + " it is great to see you again.";
        } else {
            return "Username or Password incorrect, please try again";
        }
    }

    public static void getLoginScreen() {
        System.out.println("*WELCOME TO THE LOGIN PAGE*");
    }
}
