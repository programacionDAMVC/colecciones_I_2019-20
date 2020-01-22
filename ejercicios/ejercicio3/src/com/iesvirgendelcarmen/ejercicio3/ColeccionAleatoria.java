package com.iesvirgendelcarmen.ejercicio3;

import java.util.Arrays;

public class ColeccionAleatoria {
    private static final int TAMANNO = 100;
    //atributo
    private int[] arrayInt = new int[TAMANNO];
    private double valorMedio;
    //constructor
    public ColeccionAleatoria(){
        // rellenar aleatoriamente con valores de 0 a 100 inclusive
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (int) (Math.random() * 101);
        }
        valorMedio = calcularValorMedio();
        Arrays.sort(arrayInt); //ordenamos el array
    }
    //métodos

    public int[] getArrayInt() {
        return arrayInt;
    }
    public double getValorMedio() {
        return valorMedio;
    }

    private double calcularValorMedio(){
        int suma = 0;
        for (int valor: arrayInt) {
            suma += valor;
        }
        return 1.0 * suma / arrayInt.length;
    }
    public double calcularDesviacionTipica(){
        double suma = 0.0;
        for (int valor: arrayInt) {
            suma += Math.pow(valor - valorMedio, 2);
        }
        return Math.sqrt(suma / arrayInt.length);
    }
    public int[] devolverValoresPares(){
        //descubrimos el nº de datos pares
        int numeroPares = 0;
        for (int valor: arrayInt) {
            if (valor % 2 == 0) //nº par
                numeroPares++;
        }
        //definimos el array que va a albergar los valores pares
        int[] valoresPares = new int[numeroPares];
        //añadimos los valores pares al array
        int contadorPares = 0;
        for (int i = 0; i < arrayInt.length ; i++) {
            if (arrayInt[i] %2 == 0) {
                valoresPares[contadorPares] = arrayInt[i];
                contadorPares++;
            }
        }
        return valoresPares;
    }

    public int obtenerValorMinimo(){
        return arrayInt[0];
    }
    public int obtenerValorMaximo(){
        return arrayInt[arrayInt.length -1];
    }



}
