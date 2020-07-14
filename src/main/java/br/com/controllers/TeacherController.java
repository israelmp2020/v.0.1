package br.com.controllers;

import br.com.annotations.Login;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;

@Login
@Controller
@Path("professor")
public class TeacherController {
    
    @Get("novo")
    public void newTeacher() {
    }
    @Get("lista")
    public void listTeacher() {
    }
}
