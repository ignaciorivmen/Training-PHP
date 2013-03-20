<?php
	include 'Parser.php';
	include 'ToBeanXML.php';
	
	$n = 2;	//numero de Beans a crear.
	$dir = "javas/Announcement.java";
	$nombreAtri = "announcement";
	$nombre = "domain.Announcement";
	$vars = parsePrivateAttribute($dir);
	ToBeanXML($dir, $vars, $n, $nombreAtri, $nombre);
			
?>
