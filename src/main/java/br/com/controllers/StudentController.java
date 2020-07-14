package br.com.controllers;

import br.com.annotations.Login;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;

@Login
@Controller
@Path("estudante")
public class StudentController {

    @Get("novo")
    public void newStudent() {
    }
    @Get("lista")
    public void listStudent() {
    }
}
