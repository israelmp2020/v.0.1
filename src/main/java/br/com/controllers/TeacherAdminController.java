package br.com.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.annotations.LoginStudent;

@LoginStudent
@Controller
@Path("professor")
public class TeacherAdminController {
    
    @Get("novo")
    public void newTeacherAdmin() {
    }
    @Get("lista")
    public void listTeacherAdmin() {
    }
}
