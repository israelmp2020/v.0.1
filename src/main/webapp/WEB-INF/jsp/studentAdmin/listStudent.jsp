<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%--CSS bootstrap--%>
        <jsp:include page="../common/head.jsp"></jsp:include>
        <link href="${pageContext.request.contextPath}/assets/css/home.css" rel="stylesheet"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página Inicial</title>
    </head>
    <body>
        <%--MenuLateral--%>
        <jsp:include page="../common/menuHoLa.jsp"></jsp:include>

            <div id="content" class="p-4 p-md-5">


            <%--Menu Superior--%>
            <jsp:include page="../common/menuHoSu.jsp"></jsp:include>

                <h2 class="mb-4">Alunos</h2>
                <div>
                    <div>
                        <table class="table table-striped">
                            <thead>                       
                            <th scope="col">NOME</th>
                            <th scope="col">RG</th>
                            <th scope="col">IDADE</th>
                            <th scope="col">TELEFONE</th>
                            <th scope="col">CIDADE</th>
                            <th scope="col">SEXO</th>
                            <th scope="col">AÇÕES</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="m" items="${it}">
                            <tr>
                                <td >${m.name}</td>
                                <td>${m.rg}</td>
                                <td>${m.age}</td>
                                <td>${m.telefone}</td>
                                <td>${m.cidade}</td>
                                <td>${m.sexo}</td>
                                <td>
                                    <a href="${pageContext.request.contextPath}/estudante/editar/${m.id}" class="btn btn-outline-success">Visualizar</a>
                                    <a href="${pageContext.request.contextPath}/estudante/editar/${m.id}" class="btn btn-outline-primary">Editar</a>
                                    <a href="${pageContext.request.contextPath}/estudante/remover/${m.id}" class="btn btn-outline-danger">Remover</a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <%--javaScript--%>
        <jsp:include page="../common/js.jsp"></jsp:include>
        <script src="../assets/js/main.js"></script>
    </body>
</html>
