<?php
error_reporting(0);
$datos=trim($_POST['cedula']);
$consulta=array('numeroIdentificacion'=>$datos,'codigoPaquete'=>'72');
try{
$location_URL = 'http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/IInteroperador/getFichaGeneral';
$wsdl = 'http://interoperabilidad.dinardap.gob.ec:7979/interoperador?wsdl';
//$wsdl="http://webservice02.registrocivil.gob.ec:9763/services/WS_MDEPORTE_BCEDULA_INTDB_PRO_RUN?wsdl";
$user="usr_deporte";
$parametros['loggin']=$user;
$clave=htmlentities('7iHOj%k!Z5');
$parametros['pass']=$clave;
  $options = array(
     'login' => $user,
     'password' => $clave
);
$client = new SoapClient($wsdl,$options);
$result = $client->getFichaGeneral($consulta);
$value=array();
$value_error=array();

  $value_error=$result->return->mensaje;
   if(count($value_error)>0)
    {
    $value['error']='1';
       echo json_encode($value);
    exit();
    
  }
   else
    {
    
        //Numero de paquete
       /* $value['Codigo de Paquete'] = $result->return->codigoPaquete;
       //Nombre de la Instutucion de la que obtiene los datos.
        $value['Nombre Institucion'] = $result->return->instituciones->nombre;
       // valores a regresar
   
   */
   $datos=array();
   
 // $value= $result->return->instituciones->datosPrincipales->registros->campo->codigo->valor;
   
   
   foreach($result->return->instituciones->datosPrincipales->registros as   $registros)
     {
      
    $campo=$registros->campo;
    $value[$campo]=$registros->valor;
   }
 
       list($dia,$mes,$año)=explode("/",$value['fechaNacimiento']);
        $value['fechaNacimiento']=trim($año."-".$mes."-".$dia);
 



 
 
     echo json_encode($value);
  
 //$value['cedula'] = $result->return->instituciones->datosPrincipales->registros[0]->campo->codigo->valor;
 //$value2=$result->return;
    }
 
 //echo json_encode($value2);
}
catch(SoapFault $e){
 var_dump($e);
}
//$result = $client->runJob($parametros);
?>
