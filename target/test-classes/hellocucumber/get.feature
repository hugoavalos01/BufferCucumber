Feature: Prueba get

Scenario Outline: Sacamos un numero
	Given Creo un buffer
	When Insertamos un objeto <a>
	When Sacamos un numero
	Then Se decrementa el tamaño
	
	Examples:
    | a |
    | 4 |
    | 10|
	
Scenario: Sacamos de un buffer vacio
	Given Creo un buffer
	When Sacamos un numero pero el buffer esta vacio
	Then Se lanza excepcion