<?php
//Inicio del menu!!
echo '<ul>';
//La opcion Inicio va estar presente en todos los perfiles!!!
//echo '<li><a href="index.php">Inicio</a></li>';
$objUser = new Listas();
$objmenu = new Pmenu();
$objUser->login_in();
$menu = $objmenu->show_menu();
$valor =1;
$orden;

while($rowMenu=mysql_fetch_array($menu)){
  if(in_array($rowMenu['id_modulo'],$_SESSION['modules'])){
	 if ($valor==2 or  $valor==3 ){
		 $orden="one_third";
		   echo '		
		 <li class="one_third">
				<article class="bgded overlay" style="background-image:url(images/'.$rowMenu['men_nombre'].'.jpg);">
				  <div class="txtwrap"><i class="fa fa-money" style="font-size:48px"></i>
					<h6 class="heading">Incentivos</h6>
					<p>Lacus eget nullam in ornare magna nam vitae volutpat justo tincidunt&hellip;</p>
				  </div>
				  <footer><a href="'.$rowMenu['men_link'].'">Agregar &raquo;</a></footer>
				</article>
		  </li>
		 ';
	 }else{
         $orden="one_third first";		 
		   echo '
		 <li class="one_third first">
				<article class="bgded overlay" style="background-image:url(images/'.$rowMenu['men_nombre'].'.jpg);">
				  <div class="txtwrap"><i class="fa fa-money" style="font-size:48px"></i>
					<h6 class="heading">Incentivos</h6>
					<p>Lacus eget nullam in ornare magna nam vitae volutpat justo tincidunt&hellip;</p>
				  </div>
				  <footer><a href="'.$rowMenu['men_link'].'">Agregar &raquo;</a></footer>
				</article>
		  </li>
		';
	 }
	 if ($valor==3 ){
		 $valor =1;		
	  }else{
			 $valor=$valor+1;
	  }
	
	 

   
	
 
/*	    echo '<div class="productos">
         <a href="'.$rowMenu['men_link'].'"><img src="images/'.$rowMenu['men_nombre'].'.jpg" width="320" height="340" /></a>		 		     
        </div>';*/

	 /*
	 
	 echo '
		 <ul class="nospace group services">
		 <li class="'.$orden.'">
				<article class="bgded overlay" style="background-image:url(images/'.$rowMenu['men_nombre'].'.jpg);">
				  <div class="txtwrap"><i class="fa fa-money" style="font-size:48px"></i>
					<h6 class="heading">Incentivos</h6>
					<p>Lacus eget nullam in ornare magna nam vitae volutpat justo tincidunt&hellip;</p>
				  </div>
				  <footer><a href="'.$rowMenu['men_link'].'">Agregar &raquo;</a></footer>
				</article>
		  </li>
		 </ul>';*/
		 
	}
	
	 		
	 
	 
}
echo '</ul>';
?>

