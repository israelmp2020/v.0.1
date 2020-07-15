package br.com.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.components.LoginStudentSession;
import br.com.domain.Credentials;
import javax.inject.Inject;

@Controller
public class LoginStudentController {

    @Inject
    private LoginStudentSession loginStudentSession;

    @Inject
    private Result result;

    @Get("login")
    public void login() {

    }

    @Post("login")
    public void authenticate(Credentials credentials) {

        if (credentials.getUserEmail().equalsIgnoreCase("email@email.com")
                && credentials.getPassword().equals("123")) {
            loginStudentSession.setUserEmail(credentials.getUserEmail());
            loginStudentSession.setIsLogged(true);
            result.redirectTo(HomeStudentController.class).homeStudent();
        } else {
            result.include("loginErrorMsg", "Login inválido!");
            result.redirectTo(this).login();
        }
    }

    @Get("signout")
    public void signout() {
         loginStudentSession.signout();
        result.redirectTo(this).login();
    }
}
