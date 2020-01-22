package com.iesvirgendelcarmen.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaAleatoria {
   private static final int TAMANNO_INICIAL = 100;
   //atributo
    //private int[] arrayInt = new int[TAMANNO];
    private List<Integer> listaEnteros = new ArrayList();
    private double valorMedio;
    //constructor
    public ListaAleatoria(){
        // rellenar aleatoriamente con valores de 0 a 100 inclusive
       for (int i = 0; i < TAMANNO_INICIAL; i++) {
           listaEnteros.add( (int) (Math.random() * 101));
        }
       Collections.sort(listaEnteros);
       valorMedio = calcularValorMedio();
    }

    public List<Integer> getListaEnteros() {
        return listaEnteros;
    }

    public double getValorMedio() {
        return valorMedio;
    }

    private double calcularValorMedio() {
        int suma = 0;
        for (int valor: listaEnteros) {
            suma += valor;
        }
        return 1.0 * suma / listaEnteros.size();
    }

    public double calcularDesviacionTipica(){
        double suma = 0.0;
        for (int valor: listaEnteros) {
            suma += Math.pow(valor - valorMedio, 2);
        }
        return Math.sqrt(suma / listaEnteros.size()) ;
    }

    public List<Integer> devolverValoresPares(){
        List<Integer> listaPares = new ArrayList();
        for (int valor: listaEnteros) {
            if (valor % 2 == 0)
                listaPares.add(valor);
        }
        return listaPares;
    }
    public int obtenerValorMinimo(){
        return listaEnteros.get(0);
    }
    public int obtenerValorMaximo(){
         return listaEnteros.get(listaEnteros.size() -1 );
    }

}

