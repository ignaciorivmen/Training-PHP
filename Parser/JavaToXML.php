<html>
	<body>
		<?php 
		
		 include 'Parser.php';
		 include 'ToBeanXML.php';
		
		if($_POST["file"][error] > 0){
			echo $_POST["file"][error];
			}
		else{
			$vars;
			$tipos;
			$dir = $_POST["file"]["tmp_name"];
			parsePrivateAttribute($dir,$var,$tipos);
			ToBeanXML($var,$tipos);
			
		?>
	</body>
</html>
