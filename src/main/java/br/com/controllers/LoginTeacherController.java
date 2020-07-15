package br.com.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.components.LoginTeacherSession;
import br.com.domain.Credentials;
import javax.inject.Inject;

@Controller
public class LoginTeacherController {

    @Inject
    private LoginTeacherSession loginTeacherSession;

    @Inject
    private Result result;

    @Get("login")
    public void login() {

    }

    @Post("login")
    public void authenticate(Credentials credentials) {

        if (credentials.getUserEmail().equalsIgnoreCase("email@email.com")
                && credentials.getPassword().equals("123")) {
            loginTeacherSession.setUserEmail(credentials.getUserEmail());
            loginTeacherSession.setIsLogged(true);
            result.redirectTo(HomeTeacherController.class).homeTeacher();
        } else {
            result.include("loginErrorMsg", "Login inválido!");
            result.redirectTo(this).login();
        }
    }

    @Get("signout")
    public void signout() {
        loginTeacherSession.signout();
        result.redirectTo(this).login();
    }
}
