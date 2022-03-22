Feature: Prueba crear

Scenario: Creamos un buffer con tamaño negativo
	When La capacidad es negativa
	Then Lanza la excepcion IllegalArgument
	
