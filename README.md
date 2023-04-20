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