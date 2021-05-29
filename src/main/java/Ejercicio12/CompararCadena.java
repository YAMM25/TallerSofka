package Ejercicio12;

import java.util.Scanner;

public class CompararCadena {
    private String frase;

    //Método para leer variable día
    public void leerVariable(){
        Scanner lector = new Scanner (System.in);
        System.out.println("ingrese una frase ");
        frase = lector.nextLine();
    }

    public String getFrase() {
        return frase;
    }



   /* public void ContarVocales(String frase1,String frase2) {

        if(frase1.equalsIgnoreCase(frase2)){
            System.out.println("las frases son iguales");
        }else {

        }



        int cantvoc = 0;
        String compf,compv;


        for( int i=0; i<frase.length(); i++){

            for( int a=0; a<vocales.length; a++){
                compf = Character.toString(frase.charAt(i));
                compv = Character.toString(vocales[a]);
                if(compf.equalsIgnoreCase(compv)){
                    cantvoc++;
                }

            }
        }

        System.out.println("la longitud de la frase es de: "+frase.length()
                +" y la cantidad de vocales es de: "+cantvoc);
    }*/
}
