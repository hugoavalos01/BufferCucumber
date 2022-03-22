Feature: Prueba put

Scenario Outline: Insertamos un numero
	Given Creo un buffer
	When Insertamos un objeto <a>
	Then Aumenta el tamaño
	
	Examples:
    | a |
    | 4 |
    | 10|
	
Scenario: Insertamos un numero pero el buffer ya esta lleno
	Given Creo un buffer
	When Buffer esta lleno
	Then Se lanza una excepcion