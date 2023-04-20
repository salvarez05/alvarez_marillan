Integrantes: Samuel Alvarez (salvarez05), 
Diego Marillan(LightesCube)

tareas a realizar:

Analisis codigo fuente: Diego Marillan

Identificar errores: Samuel Alvarez

Refactorizar codigo fuente:Samuel Alvarez

Realizar gestion de errores: Diego Marillan

Capturas de pantalla pruebas unitarias: Diego Marillan

*Analisis Codigo Fuente*

Se registran personas entre 1 y 50.

Se crea un menu con 6 opciones y se previene el error de cierre por introducir un caracter invalido utilizando Try/Catch

El menu incluira las opciones de:

1)Agregar personas

2)Mostrar cantidad de personas mayores de edad

3)Mostrar la cantidad de personas menores de edad

4)Mostrar la cantidad de personas de tercera edad

5)Mostrar la cantidad de personas según estado civil (Soltero/a - Casado/a)

6)Salir

Siendo "a" la variable utilizada para el menu, a>0 y a<6 (6 finalizara el menu)

Si hay cupo disponible, se registrara el nombre del individuo, su estado civil y su edad. 
Posteriormente, hay 3 Try/Catch para prevenir el ingreso de datos con caracteres no validos para iniciar las variables, uno por cada variable presente.

Se contabiliza la cantidad de personas registradas, registrando nombres, estado civil, edad y limitando cupos cuando estos exceden los 50. 
Se utilizan las variables "c" y "d",
Siendo "d" el numero de solteros y  
siendo "c" el numero de casados.

"menores de edad" es el contador de menores de edad
"Mayores de edad" indicara la cantidad de mayores de edad.


Se imprime la cantidad de mayores de edad en el registro.

Se imprime la cantidad de menores de edad en el registro.

Se contabiliza y se imprime la cantidad de personas casadas y solteras hay en el registro.

Se imprime la cantidad de personas de tercera edad hay en el registro.

Presionando el numero 6, se dara por finalizado el programa.

Se presenta un metodo que indica el ultimo espacio ocupado. (Variable "quesera")

El metodo haycupo es un boolean que indica si quedan cupos disponibles (Limite de 50 cupos)

Ultimo metodo muestra cuantos espacios disponibles existen en el array.








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

*Analisis Codigo Fuente*

Se registran personas entre 1 y 50.

Se crea un menu con 6 opciones y se previene el error de cierre por introducir un caracter invalido utilizando Try/Catch

El menu incluira las opciones de:

1)Agregar personas

2)Mostrar cantidad de personas mayores de edad

3)Mostrar la cantidad de personas menores de edad

4)Mostrar la cantidad de personas de tercera edad

5)Mostrar la cantidad de personas según estado civil (Soltero/a - Casado/a)

6)Salir

Siendo "a" la variable utilizada para el menu, a>0 y a<6 (6 finalizara el menu)

Si hay cupo disponible, se registrara el nombre del individuo, su estado civil y su edad. 
Posteriormente, hay 3 Try/Catch para prevenir el ingreso de datos con caracteres no validos para iniciar las variables, uno por cada variable presente.

Se contabiliza la cantidad de personas registradas, registrando nombres, estado civil, edad y limitando cupos cuando estos exceden los 50. 
Se utilizan las variables "c" y "d",
Siendo "d" el numero de solteros y  
siendo "c" el numero de casados.

"menores de edad" es el contador de menores de edad
"Mayores de edad" indicara la cantidad de mayores de edad.


Se imprime la cantidad de mayores de edad en el registro.

Se imprime la cantidad de menores de edad en el registro.

Se contabiliza y se imprime la cantidad de personas casadas y solteras hay en el registro.

Se imprime la cantidad de personas de tercera edad hay en el registro.

Presionando el numero 6, se dara por finalizado el programa.

Se presenta un metodo que indica el ultimo espacio ocupado. (Variable "quesera")

El metodo haycupo es un boolean que indica si quedan cupos disponibles (Limite de 50 cupos)

Ultimo metodo muestra cuantos espacios disponibles existen en el array.
