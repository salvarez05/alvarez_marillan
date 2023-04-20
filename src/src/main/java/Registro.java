import java.util.InputMismatchException;
import java.util.Scanner;
public class Registro {
    public static void main(String[] args) {
        String [][] registro = new String[50][3];
        menu(registro);
    }

    public static void menu(String[][] registro) {
        Scanner teclado = new Scanner(System.in);
        int opcion = -1;
        System.out.println("""
                Menú
                1) Agregar persona.
                2) Mostrar la cantidad de personas mayores de edad.
                3) Mostrar la cantidad de personas menores de edad.
                4) Mostrar la cantidad de personas de tercera edad.
                5) Mostrar la cantidad de personas según estado civil (Soltero/a - Casado/a).
                6)Salir.
                """);

        while(opcion !=6){
            System.out.println("Seleccione acción a realizar");
            opcion= teclado.nextInt();
            switch (opcion) {
                case 1:
                    ingresoPersonas(registro);
                    break;
                case 2:
                    mostrarMayores(registro);
                    break;
                case 3:
                    mostrarMenores(registro);
                    break;
                case 4:
                    mostrarTerceraEdad(registro);
                    break;
                case 5:
                    mostrarEstadoCivil(registro);
                    break;
                case 6:
                    System.out.println("Saliendo del menú");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }

    }

    private static void mostrarEstadoCivil(String[][] registro) {
        int casados = 0;
        int solteros = 0;
        for (int i = 0; i < registro.length; i++) {
           if(registro[i][1].equals("casado/a")) {
                casados++;
            } else if(registro[i][1].equals("soltero/a")) {
                solteros++;
            }
        }




        System.out.println("Hay " + casados + " casados/as.");
        System.out.println("Hay " + solteros + " solteros/as.");
    }

    private static void mostrarTerceraEdad(String[][] registro) {
        int contadorTerceraEdad = 0;
        for (int i = 0; i < registro.length; i++) {
            if (Integer.parseInt(String.valueOf(registro[i][2])) >= 60 && registro[i][1].equals("casado/a")) {
                contadorTerceraEdad++;
            } else if(Integer.parseInt(String.valueOf(registro[i][2])) >= 65 && registro[i][1].equals("soltero/a")) {
                contadorTerceraEdad++;
            }
        }
        System.out.println("Hay " + contadorTerceraEdad + " personas de tercera edad");
    }

    private static void mostrarMenores(String[][] registro) {
        int menoresDeEdad = 0;
        for (int i = 0; i < cuposOcupados(registro); i++) {
            if (Integer.parseInt(String.valueOf(registro[i][2])) < 18) menoresDeEdad++;
        }




        System.out.println("Hay " + menoresDeEdad + " menores de edad.");
    }

    private static void mostrarMayores(String[][] registro) {
        int mayoresDeEdad = 0;
        for (int i = 0; i < cuposOcupados(registro); i++) {
            if (Integer.parseInt(String.valueOf(registro[i][2])) >= 18) mayoresDeEdad++;
        }




        System.out.println("Hay " + mayoresDeEdad + " mayores de edad.");

    }

    public static void ingresoPersonas(String[][] registro) {
        if(hayCupo(registro)) {
            String nombre="";
            String Estadocivil="";
            String edad="";
                try {
                    System.out.println("Ingrese nombre");
                    nombre = new Scanner(System.in).nextLine();
                } catch (InputMismatchException e) {
                    System.err.println("Opción inválida");
                }
                try {
                    System.out.println("Ingrese estado civil: casado/a o soltero/a");
                    Estadocivil = new Scanner(System.in).nextLine();
                } catch (InputMismatchException e) {
                    System.err.println("Opción inválida");
                }

                try {
                    System.out.println("Ingrese edad");
                    edad = new Scanner(System.in).nextLine();
                } catch (InputMismatchException e) {
                    System.err.println("Opción inválida");
                }
            registro[cuposOcupados(registro)][0] = nombre;
            registro[cuposOcupados(registro)][1] = Estadocivil;
            registro[cuposOcupados(registro)][2] = edad;
            System.out.println("Persona Ingresada");
            }
        }



    public static int cuposOcupados(String [][] registro) {
        return registro.length - cuposDisponibles(registro);
    }




    public static boolean hayCupo(String [][] registro) {
        return cuposDisponibles(registro) != 0;
    }




    public static int cuposDisponibles(String [][] registro) {
        for(int i = 0; i < registro.length; i++) {
            if(registro[i][0] == null){
                return registro.length - i;
            }
        }




        return 0;
    }
}