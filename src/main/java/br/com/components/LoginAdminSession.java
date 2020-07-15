package br.com.components;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;

@SessionScoped
public class LoginAdminSession implements Serializable {

    private boolean isLogged;
    private String userEmail;

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public boolean isLogged() {
        System.out.println("isLogged " + isLogged);
        return isLogged;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setIsLogged(Boolean isLogged) {
        this.isLogged = isLogged;
    }

    public void signout() {
        this.isLogged = false;
        this.userEmail = null;
    }
}
