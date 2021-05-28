package Ejercicio7;

import Ejercicio1.NumeroMayor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Comparar objnum = new Comparar();
        Scanner lector = new Scanner (System.in);
        boolean resp=false;

        do{
            System.out.println("Ingrese un numero mayor o igual que cero: ");
            objnum.setNumero1(lector.nextInt());
            resp = objnum.isRespuesta();
            System.out.println("El número ingresado fue: "+objnum.getNumero1());

        }while(resp = true);

    }
}
