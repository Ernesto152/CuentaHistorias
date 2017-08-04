/**
 * Created by usuario on 04/08/2017.
 */
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
        alert("Debe rellenar ambos campos");
        return false;
    }else if (description.value.includes(peter.value) && description.value.includes(peter2.value) && description.value.includes(peter3.value) && description.value.includes(peter4.value) && description.value.includes(peter5.value)   ){
        //alert ("ingreso correctamente");
        return true;
    }else {
        alert("Debe incluir todas las palabras generadas");
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
