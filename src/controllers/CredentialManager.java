package controllers;

public class CredentialManager {
    private final String username = "VH";
    private final String password = "123";
    public boolean validateLogin(String inputUsername,String inputPassword){
        if(username.equals(inputUsername) && password.equals(inputPassword)){
            return true;
        }
        return false;

    }
}
