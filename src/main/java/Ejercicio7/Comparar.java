package Ejercicio7;

public class Comparar {
    private int numero1;
    private boolean respuesta;

    public Comparar(){
        respuesta=false;
    }

    public Comparar(int numero1, boolean respuesta) {
        this.numero1 = numero1;
        this.respuesta = respuesta;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero1() {
        return numero1;
    }

    public boolean isRespuesta() {
        if (numero1 >= 0){
           respuesta = true;
        }
        if (numero1 < 0){
            respuesta = false;
        }
        return respuesta;
    }


}
