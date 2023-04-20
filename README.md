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
Siendo "d" el numero de casados y  
siendo "c" el numero de solteros.

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







