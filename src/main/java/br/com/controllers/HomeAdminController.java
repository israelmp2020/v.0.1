package br.com.controllers;


import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.annotations.LoginStudent;

@LoginStudent
@Controller
public class HomeAdminController {

    @Path("home-admin")
    public void homeAdmin() {

    }
}
