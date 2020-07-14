<div class="wrapper d-flex align-items-stretch">
    <nav id="sidebar">
        <div class="p-4 pt-5">
            <a href="#" class="img logo rounded-circle mb-5" style="background-image: url(assets/img/logo.jpg);"></a>
            <ul class="list-unstyled components mb-5">
                <li class="active">
                    <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Cadastrar Novo</a>
                    <ul class="collapse list-unstyled" id="homeSubmenu">
                        <li>
                            <a href="${pageContext.request.contextPath}/estudante/novo">Aluno</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/professor/novo">Professor</a>
                        </li>                      
                    </ul>
                </li>
                <li>
                    <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Cadastrados</a>
                    <ul class="collapse list-unstyled" id="pageSubmenu">
                        <li>
                            <a href="${pageContext.request.contextPath}/estudante/lista">Alunos</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/professor/lista">Professores</a>
                        </li>

                    </ul>
                </li>
                <li>
                    <a href="#">Contato</a>
                </li>
            </ul>
        </div>
    </nav>
