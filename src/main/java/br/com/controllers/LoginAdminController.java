package br.com.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.components.LoginAdminSession;
import br.com.domain.Credentials;
import javax.inject.Inject;

@Controller
public class LoginAdminController {

    @Inject
     private LoginAdminSession loginAdminSession;

    @Inject
    private Result result;

    @Get("login")
    public void login() {

    }

    @Post("login")
    public void authenticate(Credentials credentials) {

        if (credentials.getUserEmail().equalsIgnoreCase("email@email.com")
                && credentials.getPassword().equals("123")) {
            loginAdminSession.setUserEmail(credentials.getUserEmail());
            loginAdminSession.setIsLogged(true);
            result.redirectTo(HomeAdminController.class).homeAdmin();
        } else {
            result.include("loginErrorMsg", "Login inválido!");
            result.redirectTo(this).login();
        }
    }

    @Get("signout")
    public void signout() {
        loginAdminSession.signout();
        result.redirectTo(this).login();
    }
}
