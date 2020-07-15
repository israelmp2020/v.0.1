package br.com.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.annotations.LoginStudent;

@LoginStudent
@Controller
@Path("estudante")
public class StudentAdminController {

    @Get("novo")
    public void newStudent() {
    }
    @Get("lista")
    public void listStudent() {
    }
}
