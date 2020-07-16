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
import br.com.components.LoginTeacherSession;
import br.com.controllers.LoginTeacherController;

@Intercepts
public class LoginTeacherIntercepts implements Interceptor {

    @Inject
    private LoginTeacherSession loginTeacherSession;

    @Inject
    private Result result;

    @Override
    public void intercept(InterceptorStack is, ControllerMethod cm, Object o) {
        System.out.println("loginStudenSession" + loginTeacherSession.isLogged());
        if (loginTeacherSession.isLogged()) {
            is.next(cm, o);
        } else {
            loginTeacherSession.signout();
            result.redirectTo(LoginTeacherController.class).loginTeacher();
        }
    }

    @Override
    public boolean accepts(ControllerMethod cm) {
        boolean canGo = cm.containsAnnotation(LoginStudent.class) || cm.getController().getType().isAnnotationPresent(LoginStudent.class);
        System.out.println("Can go " + canGo);
        return canGo;
    }

}
