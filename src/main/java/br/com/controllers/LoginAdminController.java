package br.com.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.components.LoginAdminSession;
import br.com.domain.CredentialsAdmin;
import javax.inject.Inject;

@Controller
public class LoginAdminController {

    @Inject
     private LoginAdminSession loginAdminSession;

    @Inject
    private Result result;

    @Get("login-admin")
    public void loginAdmin() {

    }

    @Post("login-admin")
    public void authenticate(CredentialsAdmin credentialsAdmin) {

        if (credentialsAdmin.getUserEmail().equalsIgnoreCase("email@email.com")
                && credentialsAdmin.getPassword().equals("123")) {
            loginAdminSession.setUserEmail(credentialsAdmin.getUserEmail());
            loginAdminSession.setIsLogged(true);
            result.redirectTo(HomeAdminController.class).homeAdmin();
        } else {
            result.include("loginErrorMsg", "Login inválido!");
            result.redirectTo(this).loginAdmin();
        }
    }

    @Get("signout-admin")
    public void signout() {
        loginAdminSession.signout();
        result.redirectTo(this).loginAdmin();
    }
}
