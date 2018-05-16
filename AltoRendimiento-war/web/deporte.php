<?php 
require_once("../class/conexion.php");
$sql="select id_dep, dep_descripcion from md_deportes_t where dep_estado='1'";
$operadora=mysqli_query($sode,$sql) or die (mysql_error());
$i=0;
$jason=array();
while($row=mysqli_fetch_object($operadora)){	
	$jason[$i]['id_dep']=$row->id_dep;
	$jason[$i]['dep_descripcion']=utf8_encode($row->dep_descripcion);
	$i++;
	}
echo json_encode($jason);	
mysqli_close($sode);?>