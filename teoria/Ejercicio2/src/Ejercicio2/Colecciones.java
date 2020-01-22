package Ejercicio2;

import java.util.Arrays;

public class Colecciones {
    //atributos
    private int[] coleccion1 = new int[10];
    private int[] coleccion2 = new int[10];
    //constructor
    public Colecciones(int valorRellanarColeccion2){
        //rellenar con 3s
        for (int i = 0; i < coleccion1.length ; i++) {
            coleccion1[i] = 3;
        }
        Arrays.fill(coleccion2, valorRellanarColeccion2);
    }
    public void mostrarValores(){
        for (int i = 0; i < coleccion1.length; i++) {
            System.out.printf("Posición %d:%5d%5d%n",
                    i, coleccion1[i], coleccion2[i]);
        }
    }
}
