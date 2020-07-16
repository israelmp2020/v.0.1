package br.com.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.components.LoginTeacherSession;
import br.com.domain.CredentialsTeacher;
import javax.inject.Inject;

@Controller
public class LoginTeacherController {

    @Inject
    private LoginTeacherSession loginTeacherSession;

    @Inject
    private Result result;

    @Get("login-professor")
    public void loginTeacher() {

    }

    @Post("login-professor")
    public void authenticate(CredentialsTeacher credentialsTeacher) {

        if (credentialsTeacher.getUserEmail().equalsIgnoreCase("email@email.com")
                && credentialsTeacher.getPassword().equals("123")) {
            loginTeacherSession.setUserEmail(credentialsTeacher.getUserEmail());
            loginTeacherSession.setIsLogged(true);
            result.redirectTo(HomeTeacherController.class).homeTeacher();
        } else {
            result.include("loginErrorMsg", "Login inválido!");
            result.redirectTo(this).loginTeacher();
        }
    }

    @Get("signout-professor")
    public void signout() {
        loginTeacherSession.signout();
        result.redirectTo(this).loginTeacher();
    }
}
