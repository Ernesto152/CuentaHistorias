<%--
  Created by IntelliJ IDEA.
  User: usuario
  Date: 07/07/2017
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="b" uri="http://bootstrapjsp.org/" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="bootstrap.jsp"/>
<jsp:include page="navbar.jsp"/>
<link rel="stylesheet" href="../Resources/css/bootstrap.min.css">
<html>
<head>



    <style>
        body{
            background-image: url("img/writer.jpg");
        }
    </style>
</head>
<body id="story">
<b:container>
    <b:jumbotron tittle="Sample">
        <h1>Cuentanos tu historia</h1>
        <p>En esta sección podrás dar riendas sueltas a tu imaginación, para así crear una breve historia por mas loca que esta parezca solo tienes que plasmarla en el campo de abajo. Te brindaremos unas palabras para que desarrolles una conexión entre estas, no te preocupes si tu historia no tiene mucha coherencia, solo diviértete y escríbela xD.</p>
    </b:jumbotron>
</b:container>
<b:container>
    <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-10 col-md-offset-1 col-lg-10 col-md-offset-1">
            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-2 col-lg-2">
                    <p>
                        <img class="img-circle" src="img/imgProject/profile.png" alt="Generic placeholder image" width="80" height="80">
                    </p>
                    <p>
                        <strong><s:property value="#session.user_name"/> <s:property value="#session.user_lastName"/></strong>
                    </p>
                </div>
                <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10">
                    <div id="tu">
                            <form name="formu" action="story">
                                <jsp:useBean id="service" class="pe.edu.utp.cuentahistorias.services.CHService"/>
                                <c:forEach var="word"  items="${service.randomWords}" varStatus="record">
                                    <input id="nombre" name="nombre" class="btn btn-sm btn-primary" value="${word.name}">
                                </c:forEach>

                                <jsp:useBean id="service2" class="pe.edu.utp.cuentahistorias.services.CHService"/>
                                <c:forEach var="word"  items="${service2.randomWords}" varStatus="record">
                                   <input id="nombre2" name="nombre2" class="btn btn-sm btn-primary" value="${word.name}">
                                </c:forEach>

                                <jsp:useBean id="service3" class="pe.edu.utp.cuentahistorias.services.CHService"/>
                                <c:forEach var="word"  items="${service3.randomWords}" varStatus="record">
                                    <input id="nombre3" name="nombre3" class="btn btn-sm btn-primary" value="${word.name}">
                                </c:forEach>

                                <jsp:useBean id="service4" class="pe.edu.utp.cuentahistorias.services.CHService"/>
                                <c:forEach var="word"  items="${service4.randomWords}" varStatus="record">
                                    <input id="nombre4" name="nombre4" class="btn btn-sm btn-primary" value="${word.name}" height="50%">
                                </c:forEach>

                                <jsp:useBean id="service5" class="pe.edu.utp.cuentahistorias.services.CHService"/>
                                <c:forEach var="word"  items="${service5.randomWords}" varStatus="record">
                                    <input id="nombre5" name="nombre5"  class="btn btn-sm btn-primary" value="${word.name}">
                                </c:forEach>
                            <!--<div class="form-group">

                                    <%-- <div class="col-xs-5">
                                       <button type="button" class="btn btn-primary" onclick="vari('nombre'),vari2('nombre2'),vari3('nombre3'),vari4('nombre4'),vari5('nombre5')" >
                                         <span class="glyphicon glyphicon-lock"></span> Enviar</button>
                                </div>--%>
                            </div>-->
                            </form>
                        <br>
                    </div>
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <div class="btn-group btn-group-sm" role="group" aria-label="...">
                                <button type="button" class="btn btn-primary">
                                    <span class="glyphicon glyphicon-bold" aria-hidden="true"></span>
                                </button>
                                <button type="button" class="btn btn-primary">
                                    <span class="glyphicon glyphicon-italic" aria-hidden="true"></span>
                                </button>
                            </div>
                        </div>
                   <div class="panel-body">
                       <s:form action="addStory" id="chat" name="formulario">
                           <s:hidden name="user" value="%{#session.user_id}"/>
                           Título: <s:textfield name="title" class="form-control" placeholder="¿Cómo desea titular su historia?" size="100%" onfocus="restaurar()"/>
                           <s:textarea name="description" class="form-control" rows="5" size="100%" onfocus="restaurar()"/>
                           <br>
                           <s:submit cssClass="btn btn-primary" value="Publicar" class="btn btn-primary" onclick="return encontrado()"/>
                       </s:form>
                       <!--
                            <form name="formulario"  id="chat" action="story" >

                                <input type="text" name="title" class="form-control" placeholder="Ponle titulo a tu historia" size="100%" onfocus="restaurar()" />
                                <input type="textarea" name="description" class="form-control" placeholder="Sólo siéntate y deja que fluya..." height="160" size="100%" onfocus="restaurar()"/>
                                <input type="submit" cssClass="btn btn-primary" onclick=" return encontrado()" class="btn btn-primary" value="Publicar"  />
                                       <%--onclick=" return comprobar()"--%>
                            </form>
                            <p id="aviso"></p>

                        </div>
                        -->
                    </div>
                    <input id="file_url" type="file" class="form-control " id="exampleInputFile" aria-describedby="fileHelp" value="Agrega una Imagen" >

                    <s:div id="vista_previa" class="form-control "></s:div>
                </div>
            </div>
        </div>

    </div>
</b:container>
<jsp:include page="footer.jsp"/>
<!--<input type="file" class="form-control-file" id="exampleInputFile" aria-describedby="fileHelp">-->
</body>





<%--<script>
    function mostrarImagen(input) {
        if (input.files && input.files[0]) {
            var reader = new FileReader();
            reader.onload = function (e) {
                $('#img_destino').attr('src', e.target.result);
            }
            reader.readAsDataURL(input.files[0]);
        }
    }

    $("#file_url").change(function(){
        mostrarImagen(this);
    });
</script>--%>
<script type="text/javascript" src="../Resources/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="../Resources/js/bootstrap.min.js"></script>
<script language="JavaScript">

    var pal;
    var pal2;
    var pal3;
    var pal4;
    var pal5;

    function vari(campo){
        pal = document.getElementById(campo).value;

        alert(pal);
    }

    function vari2(campo){
        pal2 = document.getElementById(campo).value;

        alert(pal2);
    }
    function vari3(campo){
        pal3 = document.getElementById(campo).value;
        alert(pal3);
    }
    function vari4(campo){
        pal4 = document.getElementById(campo).value;
        alert(pal4);
    }
    function vari5(campo){
        pal5 = document.getElementById(campo).value;
        alert(pal5);
    }

    var peter = document.formu.nombre;
    var peter2 = document.formu.nombre2;
    var peter3 = document.formu.nombre3;
    var peter4 = document.formu.nombre4;
    var peter5 = document.formu.nombre5;
    var grocerias = [peter.value, peter2.value, peter3.value, peter4.value, peter5.value];

    function comprobar() {

        var description = document.formulario.description;
        var title = document.formulario.title;
        var aviso = document.getElementById("aviso");

        aviso.innerHTML = "";
        var enviar = "si";
        alert(grocerias);

        if (description.value != peter.value || description.value.indexOf(" ") == 0) {
            var texto = "Es obligatorio introducir la palabra.<br/>";
            aviso.innerHTML += texto;
            enviar = "no";
        }
        if (title.value != "perro" || title.value.indexOf(" ") == 0 ) {
            var texto = "Debe introducir un titulo. <br/>";
            aviso.innerHTML += texto;
            enviar = "no";
        }
        if (enviar == "no") { return false}
    }
    function restaurar() {
        var aviso = document.getElementById("aviso");
        aviso.innerHTML = "";
    }

    var aqui="";
    function comprob(esto,donde){
        alert(esto);
        alert(donde);
        if(aqui==""){
            aqui= document.getElementById(donde).innerHTML;
            alert(aqui);
        }
        document.getElementById(donde).innerHTML = aqui.split(esto).join("<b style='color:red'>" + esto + "</b>");
    }

    function encontrado() {
        var description = document.formulario.description;

        if (description.value == "" || description.value.indexOf(" ") == 0) {
            alert("Escriba su historia aqui");
            return false;
        }else if (description.value.includes(peter.value) && description.value.includes(peter2.value) && description.value.includes(peter3.value) && description.value.includes(peter4.value) && description.value.includes(peter5.value)   ){
            alert ("ingreso correctamente");
            return true;
        }else {
            alert("debe incluir todas las palabras");
            return false;
        }
        return false;
    }

    var textobusq = "";
    var textorempl = "";
    var textolisto = "";

    function find(){
        textobusq = document.getElementById("text0").value;
        return  textobusq;
    }
    function STRTemp(textremp){
        //Recoge el texto con el que se desea remplazar
        textorempl = document.getElementById("text1").value;
        textolisto = textremp.replace(new RegExp(find(),"g") ,textorempl);
        return  textolisto;
    }
    function replace(){

        if (find().length == 0) {
            alert("No hay palabra para buscar");
        } else {

            var textremp = document.getElementById("tremp").value;

            if (textremp.search(find()) < 0) {
                alert("No hay resultados");
            } else {
                document.getElementById("tremp").value = STRTemp(textremp);
            }
        }
    }

    function filtro(){
        var nodo = document.getElementById("chat").elements["texto"]
        var textarea = nodo.value;
        for(var i = 0; i < grocerias.length;i++){
            regex = new RegExp("(^|\\s)"+grocerias[i]+"($|(?=\\s))","gi")
            textarea = textarea.replace(regex, function($0, $1){return $1 + "#4@!@"});
        }
        nodo.value = textarea;
    }
</script>
</html>
