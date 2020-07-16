<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%--CSS bootstrap--%>
        <jsp:include page="../common/head.jsp"></jsp:include>
        <link href="${pageContext.request.contextPath}/assets/css/login.css" rel="stylesheet"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Faça login</title>
    </head>
    <body class="text-center">
                <form action="login-aluno" method="post" class="form-signin">
                    <br/>
                    <img class="mb-4" src="assets/icons/login.svg" alt="" width="100" height="100">
                    <label for="userEmail" class="sr-only">Login</label>
                    <input type="text" id="userEmail" name="credentialsStudent.userEmail" class="form-control" placeholder="email@email.com"/> 
                    <br/>
                    <label for="password" class="sr-only">Password</label>
                    <input type="password" id="password" name="credentialsStudent.password"class="form-control" placeholder="password">
                    <br/>
                    <button class="btn btn-lg btn-primary btn-block" type="submit" style="background:#044da1; border: none;">Entrar</button>
                    <p style='color:red;'>
                        ${loginErrorMsg}
                    </p>
             </form>
        <%--javaScript--%>
        <jsp:include page="../common/js.jsp"></jsp:include>
    </body>
</html>
