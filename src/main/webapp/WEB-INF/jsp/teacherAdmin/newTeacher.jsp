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

                <h2 class="mb-4">Novo Professor</h2>
                <div>
                    <form>
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="inputEmail4">Nome completo</label>
                                <input type="text" class="form-control" id="inputEmail4" placeholder="Ex: João Morais da Silva">
                            </div>
                            <div class="form-group col-md-6">
                                <label for="inputPassword4">Sobrenome</label>
                                <input type="password" class="form-control" id="inputPassword4" placeholder="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputAddress">Address</label>
                            <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
                        </div>
                        <div class="form-group">
                            <label for="inputAddress2">Address 2</label>
                            <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="inputCity">Endereço</label>
                                <input type="text" class="form-control" id="inputCity">
                            </div>
                            <div class="form-group col-md-4">
                                <label for="inputState">State</label>
                                <select id="inputState" class="form-control">
                                    <option selected>Choose...</option>
                                    <option>...</option>
                                </select>
                            </div>
                            <div class="form-group col-md-2">
                                <label for="inputZip">Zip</label>
                                <input type="text" class="form-control" id="inputZip">
                            </div>
                        </div>
                        <button type="submit" class="btn btn-primary">Cadastrar</button>
                    </form>
                </div>
            </div>

        <%--javaScript--%>
        <jsp:include page="../common/js.jsp"></jsp:include>
        <script src="../assets/js/main.js"></script>
    </body>
</html>
