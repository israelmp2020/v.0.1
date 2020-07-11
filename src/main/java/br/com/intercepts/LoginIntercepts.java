package br.com.intercepts;

import br.com.annotations.Login;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.components.LoginSession;
import br.com.controllers.LoginController;
import javax.inject.Inject;

@Intercepts
public class LoginIntercepts implements Interceptor {

    @Inject
    private LoginSession loginSession;

    @Inject
    private Result result;

    @Override
    public void intercept(InterceptorStack is, ControllerMethod cm, Object o) {
        System.out.println("loginSession" + loginSession.isLogged());
        if (loginSession.isLogged()) {
            is.next(cm, o);
        } else {
            loginSession.signout();
            result.redirectTo(LoginController.class).login();
        }
    }

    @Override
    public boolean accepts(ControllerMethod cm) {
        boolean canGo = cm.containsAnnotation(Login.class) || cm.getController().getType().isAnnotationPresent(Login.class);
        System.out.println("Can go " + canGo);
        return canGo;
    }

}
