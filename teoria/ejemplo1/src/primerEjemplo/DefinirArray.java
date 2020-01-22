package primerEjemplo;

import java.util.Arrays;
import java.util.Scanner;

public class DefinirArray {
    public static void main(String[] args) {
        final int TAMANNO = 5; //definimos el tamaño del array
        int[] numeros = new int[TAMANNO]; //definimos el array
        Scanner sc = new Scanner(System.in); //para leer desde consola
        int suma = 0; //acumulador de la suma de valores
        int i;
        for (i = 0 ; i < TAMANNO; i++) {
            System.out.println("Introduce un valor");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }
        System.out.println("Valor de suma " + suma);
        System.out.println("Valor de i " + i);
        System.out.println("Valor del array " + numeros.toString());
        System.out.println("Array: " + Arrays.toString(numeros));
        //calculamos nº de elementos que están por debajo de la media
        double media = 1.0 * suma / TAMANNO; //¡OJO! división de enteros
        int contador = 0; //variable que acumula el nº valores inferiores a la media
        for (int j = 0; j < TAMANNO; j++) {
            if (numeros[j] < media)
                contador++;
        }
        System.out.printf("Valor medio %.2f y nº de valores por debajo de la media %d%n",
                media, contador);
    }


}
