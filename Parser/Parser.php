<?php
	function parsePrivateAttribute($file_dir){
	
		$file=fopen($file_dir,"r") or exit("Unable to open file!");
		$vars;
		$i=0;
		
			do{
				$linea = fgets($file);
				sscanf($linea,"	private %s %s;",$vars[$i][0] , $vars[$i][1]);
				$vars[$i][1] = str_ireplace(";","",$vars[$i][1]); 
				if ($vars[$i][0]!=""){/* echo($vars[$i][0] . " " . $vars[$i][1] . "\n" );*/ $i++; }
				}
			while (!feof($file));
			
		fclose($file);
		return($vars);	
		}
		
?>
