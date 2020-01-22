package com.iesvirgendelcarmen.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class ColeccionDinamica {
    //atributo
    private List<String> lista = new ArrayList<>();
    //métodos
    public boolean eliminarCadena (String cadena){
        return lista.remove(cadena);
    }
    public boolean annadirCadena (String cadena) {
        return lista.add(cadena);
    }
    public boolean existeCadena (String cadena) {
        return lista.contains(cadena);
    }
    public List<String> devolverCadenasMayorLongitud(){
        List<String> listaCadenasGrandes = new ArrayList<>();
        //algoritmo
        int tamanno = 0;
        for (String cadena: lista) {
           /* if (cadena.length() > tamanno) {
                tamanno = cadena.length();
                listaCadenasGrandes.clear();
                listaCadenasGrandes.add(cadena);
            }
            else if (cadena.length() == tamanno){
                listaCadenasGrandes.add(cadena);
            }
            else { //no hacer nada}*/
           if (cadena.length() >= tamanno){
               if (cadena.length() > tamanno) {
                   tamanno = cadena.length();
                   listaCadenasGrandes.clear();
               }
               listaCadenasGrandes.add(cadena);
           }
        }
        return  listaCadenasGrandes;
    }

    @Override
    public String toString() {
        return lista.toString();
    }

    /*comprobambos con main
    public static void main(String[] args) {
        ColeccionDinamica coleccionDinamica =
                new ColeccionDinamica();
        System.out.printf("Tamaño de la colección %d%n",
                coleccionDinamica.lista.size());
        coleccionDinamica.annadirCadena("a");
        coleccionDinamica.annadirCadena("hola");
        coleccionDinamica.annadirCadena("adios");
        coleccionDinamica.annadirCadena("hello");
        coleccionDinamica.annadirCadena("bye");
        coleccionDinamica.annadirCadena("hi");
        System.out.printf("Tamaño de la colección %d%n",
                coleccionDinamica.lista.size());
        System.out.printf("Eliminando cadena %s, éxito: %b%n",
                "hola", coleccionDinamica.eliminarCadena("hola"));
        System.out.printf("Tamaño de la colección %d%n",
                coleccionDinamica.lista.size());
        System.out.printf("Eliminando cadena %s, éxito: %b%n",
                "hola", coleccionDinamica.eliminarCadena("hola"));
        System.out.printf("Tamaño de la colección %d%n",
                coleccionDinamica.lista.size());
        System.out.printf("Existe la cadena %s, éxito: %b%n",
                "bye", coleccionDinamica.existeCadena("bye"));
        System.out.printf("Existe la cadena %s, éxito: %b%n",
                "BYE", coleccionDinamica.existeCadena("BYE"));
         System.out.println(coleccionDinamica.devolverCadenasMayorLongitud());

    }*/
}
