package Ejercicio10;

import java.util.Scanner;

public class QuitarEspacio {
    private String frase;



    //Método para leer variable día
    public void leerVariable(){
        Scanner lector = new Scanner (System.in);
        System.out.println("ingrese una frase ");
        frase = lector.nextLine();
    }


    public void reemplazar() {

        System.out.println(frase.replaceAll("\\s+",""));
    }
}
