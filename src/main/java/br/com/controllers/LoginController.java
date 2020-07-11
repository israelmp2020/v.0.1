package br.com.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.components.LoginSession;
import br.com.domain.Credentials;
import javax.inject.Inject;

@Controller
public class LoginController {

    @Inject
    private LoginSession loginSession;

    @Inject
    private Result result;

    @Get("login")
    public void login() {

    }

    @Post("login")
    public void authenticate(Credentials credentials) {

        if (credentials.getUserEmail().equalsIgnoreCase("email@email.com")
                && credentials.getPassword().equals("12345")) {
            loginSession.setUserEmail(credentials.getUserEmail());
            loginSession.setIsLogged(true);
            result.redirectTo(HomeController.class).home();
        } else {
            result.include("loginErrorMsg", "Login inválido!");
            result.redirectTo(this).login();
        }
    }

    @Get("signout")
    public void signout() {
        loginSession.signout();
        result.redirectTo(this).login();
    }
}
