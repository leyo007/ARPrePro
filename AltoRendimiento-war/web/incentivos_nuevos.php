<?php
error_reporting(0);
require'../class/sessions.php';
require'../class/config.php';
require'../class/dbactions.php';
require'../class/incentivos.php';


$objses = new Sessions();
$objses->init();
$user = isset($_SESSION['user']) ? $_SESSION['user'] : null ;
if($user == ''){
	header('Location: http://localhost/AltoRendimiento/user/index.php?error=2');
}

$objCon = new Connection();
$objCon->get_connected();

?>

<script type="text/javascript" src="../bootstrap/js/jquery.js"></script>
<script type="text/javascript" src="../bootstrap/js/jquery-ui.js"></script>
<script type="text/javascript" src="../bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="../bootstrap/js/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="../styles/main.css">
<script>



function isNumberKey(evt)
{
         var charCode = (evt.which) ? evt.which : event.keyCode
         if (charCode > 31 && (charCode < 48 || charCode > 57))
            return false;
 
         return true;
}
	
	
$(document).ready(function(){
	var id_operadora='';
	var id_deporte='';
	var id_disciplina='';
	var cedula='';
	var id_categoria='';
	var id_valorMes;
	var id_valorCateg;
		
	cagarCombos();
	$("#btnBuscar").click(function(e){
	   cedula = $("#per_cedula").val();
	   if (cedula == "")
	   {
			alert("DEBE INGRESAR LA CEDULA DE IDENTIDAD");  
	   }
	   else
	   {	
			cargarDeportista(cedula);
	   }
	})
	
	
function cagarCombos(){
 cargarProvincias();
  cargarDeporte();
  cargarConvocatoria();
  cargarCatEdad();
  cargarMes();
  cargarCatActual();
  cargarCatpropu();
}
function cargarCatpropu(){
		$.ajax({	
			url:"../php/catProp.php",
			dataType:"json",
			success:function(Catpropu){					
			verCatProp(Catpropu)		   
			}
			})			
}

function verCatProp (Catpropu)
{
	$("#id_cat_pro").html('');
    $("#id_cat_pro").append('<option value="0">'+'Propuesta'+'</option>');
    $.each(Catpropu,function(index,item){
	$("#id_cat_pro").append('<option value="'+item.id_cat_pro+'">'+item.cat_descripcion+'</option>');
	})
}

$("#id_mes").change(function(){
	id_valorMes=$(this).val();		
		verValoresMES(id_valorMes,id_valorCateg );
	})
	
function  verValoresMES(id_valorMes,id_valorCateg )
{
	$("#inc_valor_mensual").html('');
	$("#inc_valor_mensual").append('<input type="text" name="inc_valor_mensual" id="inc_valor_mensual" value="'+id_valorCateg+'" size="22" readonly>');
	$("#inc_valor_total").html('');
	$("#inc_valor_total").append('<input type="text" name="inc_valor_total" id="inc_valor_total" value="'+id_valorCateg*id_valorMes+'" size="22" readonly>');	
}

$("#id_cat_pro").change(function(){
	id_cat_pro=$(this).val();	
	cargarvalores(id_cat_pro);
	})

function cargarvalores(id_cat_pro){
	$.ajax({
		url:"../php/valores.php",
		data:"id_cat_pro="+id_cat_pro,
		dataType:"json",			
		type:"POST",	
		success:function(valorCateg){
		 verValores(valorCateg);
		}
		})	
	}

function  verValores(valorCateg)
{
	$("#inc_valor_mensual").html('');
    $.each(valorCateg,function(index,item){
	$("#inc_valor_mensual").append('<input type="text" name="inc_valor_mensual" id="inc_valor_mensual" value="'+item.rbu_monto+'" size="22" readonly>');
	id_valorCateg = item.rbu_monto;
	})
	
	$("#inc_valor_total").html('');
    $.each(valorCateg,function(index,item){
	$("#inc_valor_total").append('<input type="text" name="inc_valor_total" id="inc_valor_total" value="'+item.rbu_monto*id_valorMes+'" size="22" readonly>');	
	})
}



/****/





function cargarCatActual(){
		$.ajax({	
			url:"../php/catActual.php",
			dataType:"json",
			success:function(CatActual){					
			 verCatActual(CatActual)		   
			}
			})			
}
function verCatActual (CatActual)
{
	$("#id_cat_actual").html('');
    $("#id_cat_actual").append('<option value="0">'+'Actual'+'</option>');
    $.each(CatActual,function(index,item){
	$("#id_cat_actual").append('<option value="'+item.id_cat_actual+'">'+item.cat_descripcion+'</option>');
	})
}

function cargarCatEdad(){
		$.ajax({	
			url:"../php/catEdad.php",
			dataType:"json",
			success:function(catEdad){					
			 verCatEdad(catEdad)		   
			}
			})			
}

function verCatEdad (catEdad)
{
	$("#id_edad").html('');
               $("#id_edad").append('<option value="0">'+'Categoria'+'</option>');
               $.each(catEdad,function(index,item){
				$("#id_edad").append('<option value="'+item.id_edad+'">'+item.cat_edad_descripcion+'</option>');
	})
}
function cargarMes(){
		$.ajax({	
			url:"../php/mes.php",
			dataType:"json",
			success:function(mes){					
			 vermes(mes)		   
			}
			})			
}
function vermes(mes)
{
	$("#id_mes").html('');
               $("#id_mes").append('<option value="0">'+'mes'+'</option>');
               $.each(mes,function(index,item){
				$("#id_mes").append('<option value="'+item.id_mes+'">'+item.mes_nombre+'</option>');
	})
}
function cargarConvocatoria(){
		$.ajax({	
			url:"../php/convocatoria.php",
			dataType:"json",
			success:function(convocatoria){					
			 verConvocatoria(convocatoria)		   
			}
			})			
}
function verConvocatoria(convocatoria)
{
	$("#id_conv").html('');
               $("#id_conv").append('<option value="0">'+'Convocatoria'+'</option>');
               $.each(convocatoria,function(index,item){
				$("#id_conv").append('<option value="'+item.id_conv+'">'+item.con_descripcion+'</option>');
	})
}
function cargarProvincias(){
		$.ajax({	
			url:"../php/provincias.php",
			dataType:"json",
			success:function(provincia){					
			 verProvincia(provincia)		   
			}
			})			
}
function verProvincia(provincia)
{
	
	$("#id_pro_rep").html('');
               $("#id_pro_rep").append('<option value="">'+'Provincia'+'</option>');
               $.each(provincia,function(index,item){
				$("#id_pro_rep").append('<option value="'+item.id_provincia_org_dep+'">'+item.nombre_div_pol+'</option>');
	})
}

function cargarDeporte(){
		$.ajax({	
			url:"../php/deporte.php",
			dataType:"json",
			success:function(deporte){
			verDeporte(deporte)		   
			}
			})			
}
function verDeporte(deporte)
{
	$("#id_dep").html('');
               $("#id_dep").append('<option value="">'+'Deporte'+'</option>');
               $.each(deporte,function(index,item){
				$("#id_dep").append('<option value="'+item.id_dep+'">'+item.dep_descripcion+'</option>');
	})
}

$("#id_dep").change(function(){
	id_deporte=$(this).val();	
	cargarDisiciplina(id_deporte)
	})

function cargarDisiciplina(dep_id){
	$.ajax({
		url:"../php/disciplina.php",
		data:"dep_id="+dep_id,
		dataType:"json",			
		type:"POST",	
		success:function(disciplina){
		 verDisciplina(disciplina)
		}
		})	
	}

function verDisciplina(disciplina)
{
	$("#id_disciplina").html('');
               $("#id_disciplina").append('<option value="">'+'Disciplina'+'</option>');
               $.each(disciplina,function(index,item){
				$("#id_disciplina").append('<option value="'+item.id_disciplina+'">'+item.dis_descripcion+'</option>');
	})
}
function cargarDeportista(cedula){
		$.ajax({
			url:"../php/deportista.php",
			data:"cedula="+cedula,
			dataType:"json",			
			type:"POST",	
			success:function(lineabase){
			 verlineabase(lineabase)
			},
			error : function(xhr, status) {
             alert('No esta registrado el deportista, ingresar por medio del sistema SAD.  ');
            }
	
		})	
	}
	
	function verlineabase(lineabase)
	{
		$("#id_lineabase").html('');
	
		$.each(lineabase,function(index,item){	
$("#id_lineabase").append('<div class="one_third first"><label for="comment">SEXO:</label><input type="text" name="id_sexo" id="id_sexo" required value="'+item.genero+'"></div><div class="one_third"><label for="lbNombre">NOMBRES;</label><input type="text" style="width:300px" name="per_nombre" id="per_nombre" required value="'+item.nombres+'"></div><div class="one_third"><label for="lbApellido">APELLIDO:</label><input type="text" style="width:300px" required name="per_apellido" id="per_apellido" value="'+item.apellidos+'"></div>');
		})
	}
})
</script>

<!DOCTYPE html>
<!--
Template Name: Geodarn
Author: <a href="http://www.os-templates.com/">OS Templates</a>
Author URI: http://www.os-templates.com/
Licence: Free to use under our free template licence terms
Licence URI: http://www.os-templates.com/template-terms
-->
<html><!-- InstanceBegin template="/Templates/Template1.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<!-- InstanceBeginEditable name="doctitle" -->
<title>Lista de Incentivos</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/buttons/1.5.1/css/buttons.dataTables.min.css">

<!-- InstanceEndEditable -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="../layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
<!-- InstanceBeginEditable name="head" -->
<!-- InstanceEndEditable -->
</head>
<body id="top">
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<!-- Top Background Image Wrapper -->
<div class="bgded overlay" style="background-image:url(../images/Collage.jpg);"> 
  <!-- ################################################################################################ -->
  <div class="wrapper row1">
    <header id="header" class="hoc clear"> 
      <!-- ################################################################################################ -->
      <div id="logo" class="fl_left">
        <h1><img src="images/3Logos.png" alt="Logo" width="161" height="76" usemap="#Map">
          <map name="Map">
            <area shape="rect" coords="2,6,244,106" href="http://www.deporte.gob.ec/" target="_blank">
          </map>
        </a></h1>
      </div>
      <nav id="mainav" class="fl_right">
        <ul class="clear">
          <li class="active"><a href="index.html">SALIR</a></li>
        </ul>
      </nav>
      
    </header>
  </div>
  <div id="pageintro" class="hoc clear"> 
    <div class="flexslider basicslider">
      <ul class="slides">
        <li>
          <article>
            <p>Ministerio del Deporte</p>
            <h3 class="heading">Proyecto de Alto Rendimiento</h3>
            <p>Vitae lobortis id ut mi in molestie in</p>
  
          </article>
        </li>
        
      </ul>
    </div>
  
  </div>
  
</div>
<div class="wrapper row3">
  <main class="hoc container clear"> 
    <div class="btmspace-80 center">
      <h3 class="nospace">Bienvenidos</h3>
      <p class="nospace"> <?php echo $_SESSION['user'];?> </p>
    </div>
   <!-- InstanceBeginEditable name="EditRegion1" -->
  <h1> NUEVOS INCENTIVOS</h1>  
        <div id="comments">
         <form  name="New Incentivo" method="POST" action="incentivos_nuevos_exe.php" >
        <ul>
          <li>
            <article>
              <header>
                <address><h2>DATOS DEL DEPORTISTA</h2></address>
              </header>
                  <div class="one_third first">
                    <label for="txtcedula">CEDULA <span>*</span></label>
                    <input type="text" name="per_cedula" id="per_cedula" value="" size="22" required>
                  </div>
                  <div class="one_third">
                    <label for="espacio">&nbsp;</label>
                    <input type="button" id="btnBuscar" value="Buscar"> 
                  </div>
                  <div class="block clear"> </div>                                                                                                   
             </article>                      
       </li>
       <li>
        <article>
                 <div id="id_lineabase"></div>
                 <div class="block clear"> </div>
        </article>
       </li>       
       <li>
           <article>
              <div class="one_third first">
                <label for="name">PRUEBA <span>*</span></label>
                <input type="text" name="per_prueba" id="per_prueba" value="" size="22" required>
              </div>
              <div class="one_third">
               <label for="espacio">&nbsp;</label>
                <label for="espacio">&nbsp;</label>
              </div>
              <div class="one_third">
               <label for="txtprovincia">PROVINCIA <span>*</span></label>
                <select id="id_pro_rep" name="id_pro_rep" class="form-control" required></select>
              </div>
            <div class="block clear">
                <label for="txtresultados">RESULTADOS ELEGIBILIDAD</label>
                <textarea name="per_resultados" id="per_resultados" cols="25" rows="10" required></textarea>
            </div>
            <div class="block clear">
                <label for="txtproyeccion">PROYECCIÓN</label>
                <textarea name="per_proyeccion" id="per_proyeccion" cols="25" rows="10" required></textarea>
            </div>
            <div class="block clear">
                <label for="comment">NOVEDAD</label>
                <textarea name="per_novedad" id="per_novedad" cols="25" rows="10" required></textarea>
            </div>
           </article>
       </li>       
       <li>
            <article>             
             <div class="one_third first">
                <label for="lbdeporte">DEPORTE</label>
                <select id="id_dep"  style="width: 250px" name="id_dep" class="form-control" required></select>
             </div>
             <div class="one_third">
                    <label for="lbdisciplina">DISCIPLINA</label>
                    <select id="id_disciplina" name="id_disciplina" class="form-control" required></select>
             </div>
             <div class="one_third">
                    <label for="lbconvocatoria">CONVOCATORIA A JUEGOS</label>
                    <select id="id_conv" name="id_conv" class="form-control" required></select>
             </div>     
                          <div class="block clear"> </div>                                                                                                   
             </article>                      
        </li> 
        <li>
            <article>
              <header>
                <address><h2>INGRESAR INCENTIVO</h2></address>
              </header>
              <div class="one_third first">
                    <label for="lbmes">MES</label>
                    <select id="id_mes" name="id_mes" class="form-control" required></select>
                 </div>
                 <div class="one_third">
                        <label for="lbcatprop">CATEGORIA PROPUESTA</label>
                        <select id="id_cat_pro" name="id_cat_pro" class="form-control" required></select>
                 </div>
                 <div class="one_third">
                        <label for="lbcatactual">CONVOCATORIA A ACTUAL</label>
                        <select id="id_cat_actual" name="id_cat_actual" class="form-control" required></select>
                 </div>     
                 <div class="block clear"> </div>   
                 
                <div class="one_third first">
                    <label for="lbcatedad">CATEGORIA A EDAD</label>
                    <select id="id_edad" name="id_edad" class="form-control" required></select>
                 </div>
                 <div class="one_third">
                    <label for="lbcatprop">VAlOR MENSUAL  Ejemplo(2316.00) </label>
                    <div id= inc_valor_mensual></div>
                 </div>
                 <div class="one_third">
                   <label for="lbmes">VALOR TOTAL</label>
                   <div id= inc_valor_total></div>                       
                 </div>     
                <div class="block clear"> </div>                                                                  
             </article>                      
           </li>
           <li>
            <div class="block clear"> </div>  
                 <div class="one_third first"></div>
                 <div class="one_third">
                  <label for="espacio">&nbsp;</label>
                  <input type="submit" name="btGuardar" id="btGuardar" value="Guardar" />
                 </div>
                 <div class="one_third"></div>
                 <div class="block clear"> </div>                                    
           </li>     
     </ul>
 </form> 
      
   <!-- InstanceEndEditable -->
   
    <div class="clear"></div>
  </main>
</div>


<div class="wrapper row4 bgded overlay" style="background-image:url('../images/demo/backgrounds/02.png');">
  <footer id="footer" class="hoc clear"> 
    <div class="one_third first">
      <h3 class="heading">redes</h3>
      <ul class="faico clear">
        <li><a class="faicon-facebook" href="#"><i class="fa fa-facebook"></i></a></li>
        <li><a class="faicon-twitter" href="#"><i class="fa fa-twitter"></i></a></li>
        <li><a class="faicon-dribble" href="#"><i class="fa fa-dribbble"></i></a></li>
        <li><a class="faicon-linkedin" href="#"><i class="fa fa-linkedin"></i></a></li>
        <li><a class="faicon-google-plus" href="#"><i class="fa fa-google-plus"></i></a></li>
        <li><a class="faicon-vk" href="#"><i class="fa fa-vk"></i></a></li>
      </ul>
    </div>
    <div class="one_third">
      <ul class="nospace meta">
        <li class="btmspace-15"><i class="fa fa-phone"></i> 0332265480</li>
        <li><i class="fa fa-envelope-o"></i> info@deporte.gob.ec</li>
      </ul>
    </div>
    <div class="one_third">
      <form method="post" action="#">
        <fieldset>
          <legend>Newsletter:</legend>
          <div class="clear">
            <input type="text" value="" placeholder="Type Email Here&hellip;">
            <button class="fa fa-share" type="submit" title="Submit"><em>Submit</em></button>
          </div>
        </fieldset>
      </form>
    </div>
    
  </footer>
</div>
<div class="wrapper row5">
  <div id="copyright" class="hoc clear">    
  </div>
</div>
<a id="backtotop" href="#top"><i class="fa fa-chevron-up"></i></a>
<!-- JAVASCRIPTS -->
<script src="layout/scripts/jquery.min.js"></script>
<script src="layout/scripts/jquery.backtotop.js"></script>
<script src="layout/scripts/jquery.mobilemenu.js"></script>
<script src="layout/scripts/jquery.flexslider-min.js"></script>
</body>
<!-- InstanceEnd --></html>