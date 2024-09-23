package com.ridesharing.auth;

public class Userauth {
	private static Userauth instance;
    private String currentUser;

    private Userauth() {
       
    }

    public static synchronized Userauth getInstance() {
        if (instance == null) {
            instance = new Userauth();
        }
        return instance;
    }

    public void login(String user) {
        currentUser = user;
        System.out.println(user + " logged in.");
    }

    public void logout() {
        System.out.println(currentUser + " logged out.");
        currentUser = null;
    }

    public String getCurrentUser() {
        return currentUser;
    }

}
