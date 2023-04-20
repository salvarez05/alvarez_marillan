Integrantes: Samuel Alvarez (salvarez05), 
Diego Marillan(LightesCube)

tareas a realizar:

Analisis codigo fuente: Diego Marillan

Identificar errores: Samuel Alvarez

Refactorizar codigo fuente:Samuel Alvarez

Realizar gestion de errores: Diego Marillan

Capturas de pantalla pruebas unitarias: Diego Marillan


-Errores-

Linea y errores en base a codigo original

Linea 5: Inicia array de String pero la inicializacion es con double

Linea 32:

Linea 35: Variable es redundante

Linea 37: el metodo haycupo() requiere doubles pero registro utiliza variable double

Linea 38,108: El metodo obtenerUltimoEspacio requiere variable double pero la variable registro es String

Linea 41: El array es de variable String mientras que edad es una variable int

Linea 74: el scanner para la variable edad utiliza .nextLine()
en vez de nextInt()

Linea 87: El array registro es de tipo String mientras que la variable edad es de tipo int 

Lineas 98, 127, 138: el array persona es tipo double mientras que el array registro es de tipo String


Linea 114: Para poder comparar las edades no se puede utilizar variables Strings

Lineas 128, 130, 139, 141, 176: El metodo .equals(String) no puede ser utilizado en doubles,
error tipo logico

Variables a, b, c son poco descriptivas (a = opcion, c= contador de solteros y d= contador de casados/as).
Hay demasiado codigo en main el cual podria ser transformado en metodos

Variables quesera, indiceDisponibles son redundantes,
Metodo opa es poco descriptivo (indica cantidad de cupos disponibles)
Los metodos requieren por lo general variable double mientras que registro es String
Hay bucles durante el menu

variables de casados y solteros estaban intercambiadas