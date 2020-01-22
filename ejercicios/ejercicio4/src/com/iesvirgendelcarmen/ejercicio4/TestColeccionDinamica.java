package com.iesvirgendelcarmen.ejercicio4;

import java.util.Scanner;

public class TestColeccionDinamica {
    public static void main(String[] args) {

        ColeccionDinamica coleccionDinamica =
                new ColeccionDinamica();
        System.out.printf("Colección %s%n", coleccionDinamica.toString());
        Scanner sc = new Scanner(System.in);
        String palabraLeida = "";
        System.out.println("Introduce cadenas, para acabar introduce fin");

        do {
            palabraLeida = sc.next();
            coleccionDinamica.annadirCadena(palabraLeida);
        } while ( !palabraLeida.equalsIgnoreCase("fin") );

        System.out.printf("Colección %s%n", coleccionDinamica.toString());
        //ELIMINAMOS LA CADENA FIN
        coleccionDinamica.eliminarCadena(palabraLeida);
        System.out.printf("Colección %s%n", coleccionDinamica.toString());
        System.out.printf("Existe la cadena %s, éxito: %b%n",
                "BYE", coleccionDinamica.existeCadena("BYE"));
        System.out.println(coleccionDinamica.devolverCadenasMayorLongitud());
    }
}
