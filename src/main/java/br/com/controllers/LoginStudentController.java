package br.com.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.components.LoginStudentSession;
import br.com.domain.CredentialsStudent;
import javax.inject.Inject;

@Controller
public class LoginStudentController {

    @Inject
    private LoginStudentSession loginStudentSession;

    @Inject
    private Result result;

    @Get("login-aluno")
    public void loginStudent() {

    }

    @Post("login-aluno")
    public void authenticate(CredentialsStudent credentialsStudent) {

        if (credentialsStudent.getUserEmail().equalsIgnoreCase("email@email.com")
                && credentialsStudent.getPassword().equals("123")) {
            loginStudentSession.setUserEmail(credentialsStudent.getUserEmail());
            loginStudentSession.setIsLogged(true);
            result.redirectTo(HomeStudentController.class).homeStudent();
        } else {
            result.include("loginErrorMsg", "Login inválido!");
            result.redirectTo(this).loginStudent();
        }
    }

    @Get("signout-aluno")
    public void signout() {
         loginStudentSession.signout();
        result.redirectTo(this).loginStudent();
    }
}
