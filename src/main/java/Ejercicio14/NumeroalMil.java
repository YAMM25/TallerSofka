package Ejercicio14;

import java.util.Scanner;

public class NumeroalMil {
    private int numero;


    //Método para leer variable
    public void leerVariable() {
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese un número mayor que cero");
        numero = lector.nextInt();
    }


    public void numero() {

        while (numero < 0) {
            System.out.println("\nEl número ingresado debe ser mayor que cero \n");
            leerVariable();
        }

        System.out.println("los número del: "+numero +" al 1000 son:");
        for (int i = numero; i <= 1000; i+=2) {
            System.out.println(i);
        }

    }
}