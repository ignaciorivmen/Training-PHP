<html>
	<body>
		<?php $edad = $_POST["age"];
		$nombre = $_POST["fname"];
		if($edad >= 18){
			echo "Bienvenido $nombre . \n";
			echo "Al tener $edad a&ntildeos puedes ver esta p&aacutegina. Aunque no me fio mucho.";

		}
		else {
			echo "Con $edad a&ntildeos no deber&iacuteas de ver estas p&aacuteginas.";
		}
?>
	</body>
</html>
