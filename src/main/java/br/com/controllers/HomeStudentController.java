package br.com.controllers;


import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.annotations.LoginStudent;

@LoginStudent
@Controller
public class HomeStudentController {

    @Path("home-aluno")
    public void homeStudent() {

    }
}
