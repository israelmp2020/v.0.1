package br.com.intercepts;

import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.components.LoginAdminSession;
import br.com.controllers.LoginAdminController;
import javax.inject.Inject;
import br.com.annotations.LoginStudent;

@Intercepts
public class LoginStudentIntercepts1 implements Interceptor {

    @Inject
    private LoginAdminSession loginAdminSession;

    @Inject
    private Result result;

    @Override
    public void intercept(InterceptorStack is, ControllerMethod cm, Object o) {
        System.out.println("loginAdminSession" + loginAdminSession.isLogged());
        if (loginAdminSession.isLogged()) {
            is.next(cm, o);
        } else {
            loginAdminSession.signout();
            result.redirectTo(LoginAdminController.class).login();
        }
    }

    @Override
    public boolean accepts(ControllerMethod cm) {
        boolean canGo = cm.containsAnnotation(LoginStudent.class) || cm.getController().getType().isAnnotationPresent(LoginStudent.class);
        System.out.println("Can go " + canGo);
        return canGo;
    }

}
