package br.com.intercepts;

import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import javax.inject.Inject;
import br.com.annotations.LoginStudent;
import br.com.components.LoginStudentSession;
import br.com.controllers.LoginStudentController;

@Intercepts
public class LoginStudentIntercepts1 implements Interceptor {

    @Inject
    private LoginStudentSession loginStudentSession;

    @Inject
    private Result result;

    @Override
    public void intercept(InterceptorStack is, ControllerMethod cm, Object o) {
        System.out.println("loginStudentSession" + loginStudentSession.isLogged());
        if (loginStudentSession.isLogged()) {
            is.next(cm, o);
        } else {
            loginStudentSession.signout();
            result.redirectTo(LoginStudentController.class).loginStudent();
        }
    }

    @Override
    public boolean accepts(ControllerMethod cm) {
        boolean canGo = cm.containsAnnotation(LoginStudent.class) || cm.getController().getType().isAnnotationPresent(LoginStudent.class);
        System.out.println("Can go " + canGo);
        return canGo;
    }

}
