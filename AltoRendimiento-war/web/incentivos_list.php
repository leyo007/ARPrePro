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
//consultamos el listado de los perfiles!!
$objPro = new Incentivos();
$list_incentivos = $objPro->list_incentivos();
?>

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
   <h2>INCENTIVOS</h2>        
        <div id="comments">
        <ul>
          <li>
            <article>
              <header>
                <address><h2>Deportistas</h2></address>
              </header>
              <div class="comcont">
                  <div class="one_third first">
			          <label for="url"><B> Ingresar Nuevo Deportista</B></label>
                   </div>
                   <div class="one_third">
                        <input type="submit" value="Nuevo" onclick = "location='incentivos_nuevos.php'"/>
                       <label for="#"> <span>&nbsp;</span></label>
                   </div>                 
              </div>
             <div class="comcont">
                   <table id="example" class="display nowrap" cellspacing="0" width="100%">
                    <thead>
                        <tr>
                            <th>CEDULA</th>
                            <th>NOMBRE</th>
                            <th>APELLIDOS</th>
                            <th>RESULTADOS</th>
                            <th>VALOR MENSUAL</th>
                            <th>VALOR TOTAL</th>
                            <th>EDITAR</th>
                        </tr>
                    </thead>
                    <tbody>
                    <?php
                $numrows = mysql_num_rows($list_incentivos);
                if($numrows > 0){
                    while($row=mysql_fetch_array($list_incentivos)){?>
                        <tr>
                            <td><?php echo $row["per_cedula"];?></td>
                            <td><?php echo $row["per_nombre"]; ?></td>
                            <td><?php echo $row["per_apellido"]; ?></td>
                            <td><?php echo $row["per_resultados"]; ?></td>
                            <td><?php echo $row["inc_valor_mensual"]; ?></td>
                            <td><?php echo $row["inc_valor_total"]; ?></td>
                            <td><a href="modify_profile.php?idPerfil=<?php echo $row["id_perfil"];?>">Modificar</a></td>
                        </tr>
                        <?php
                    }
                }
                ?>
                    </tbody>
                </table>
               </div>
                   
            </article>
          </li>
          <li>
            <article>
                  <div class="comcont">
                     <div class="scrollable">
                        <div id="datos">
			            </div>
                     </div>
                  </div>
            </article>
          </li>
        </ul>
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