package Ejercicio8;

import java.util.Scanner;

public class DiaSemana {
    private String dia;
    String nomdia[] ={"Lunes","Martes","Miercoles","Jueves","Viernes","Sábado","Domingo"};

    //Método para leer variable día
    public void leerVariable(){
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese un numero mayor o igual que cero: ");
        dia = lector.nextLine();
    }


    public void Comparar() {

      /*  switch(dia)
        {

            String s =dia ;

            case s.equalsIgnoreCase(nomdia[0]) :
                System.out.println("El lunes es un día laboral");
                break;

            case s.equalsIgnoreCase(nomdia[1]) :
                System.out.println("El Martes es un día laboral");
                break;

            case s.equalsIgnoreCase(nomdia[2]) :
                System.out.println("El Miercoles es un día laboral");
                break;

            case s.equalsIgnoreCase(nomdia[3]) :
                System.out.println("El Jueves es un día laboral");
                break;

            case s.equalsIgnoreCase(nomdia[4]) :
                System.out.println("El Viernes es un día laboral");
                break;

            case s.equalsIgnoreCase(nomdia[5]) :
                System.out.println("El Sábado es un día laboral");
                break;

            case s.equalsIgnoreCase(nomdia[6]) :
                System.out.println("El Domingo no es un día laboral");
                break;

            default:
                System.out.println("Opción no valida ");
        }*/


    }
}
