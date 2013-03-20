
<?php
	function ToBeanXML($dir, $vars, $n, $nombreAtri, $ruta){
		

		for($j=1;$j<=$n;$j++){
			echo "<bean id=\"" . $nombreAtri  . "$j\" class=\"" . $ruta . "\">\n";
			for ($i=0;$i<count($vars);$i++){
				
				if (strcmp($vars[$i][0],"String")==0){
					echo "<property name=\"" . $vars[$i][1] . "\" value=\"" . $vars[$i][1] ."$j />  \n";
				}
					
				elseif (strcmp($vars[$i][0],"Date")==0){  
					echo "<property name=\"" . $vars[$i][1] . "\" value=\"2" . $j . "/03/2013\" />  \n"	;
				}
					
				elseif (strcmp($vars[$i][0],"int")==0 or 
				strcmp($vars[$i][0],"double")==0 or	
				strcmp($vars[$i][0],"Double")==0){
					echo "<property name=\"" . $vars[$i][1] . "\" value=\"" . $j . "\" />  \n"	;
				
				}
					
				elseif (strcmp(substr($vars[$i][0], 0, 10),"Collection")==0){
					echo "<property name=\"" . $vars[$i][1] . "\">  
	<list> \n";
					for ($k=1;$k<=$n;$k++){
							echo"		<ref bean=\"". $vars[$i][1] ."$k\" /> \n";
						}
					echo"	</list> \n";
					echo"</property> \n";					
				}
					
				elseif (strcmp($vars[$i][1],"") != 0 ){
					echo "<property name=\"" . $vars[$i][1] . "\" ref=\"" . $vars[$i][1] ."$j" . "\" /> \n";
				}
				else{}
			}
			echo "<\bean>\n";
		}
		
	}

?>
