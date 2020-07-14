package br.com.controllers;


import br.com.annotations.Login;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;

@Login
@Controller
public class HomeController {

    @Path("home")
    public void home() {

    }
}
