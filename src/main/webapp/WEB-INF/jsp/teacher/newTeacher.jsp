<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%--CSS bootstrap--%>
        <jsp:include page="../common/head.jsp"></jsp:include>
        <link href="${pageContext.request.contextPath}/assets/css/home.css" rel="stylesheet"/>
        <link href="${pageContext.request.contextPath}/assets/js/main.js" rel="stylesheet"/>
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
                        
                        
                    </form>
                </div>
            </div>

        <%--javaScript--%>
        <jsp:include page="../common/js.jsp"></jsp:include>
        <script src="assets/js/main.js"></script>       
    </body>
</html>
