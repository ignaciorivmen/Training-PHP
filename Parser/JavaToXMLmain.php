<?php
	include 'Parser.php';
	include 'ToBeanXML.php';
	
	$n = 2;	//numero de Beans a crear.
	$dir = "javas/Question.java";
	$nombreAtri = "question";
	$nombre = "domain.Question";
	$vars = parsePrivateAttribute($dir);
	ToBeanXML($dir, $vars, $n, $nombreAtri, $nombre);
			
?>
