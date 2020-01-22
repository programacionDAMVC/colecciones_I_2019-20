package com.iesvirgendelcarmen.ejercicio3;

import java.util.Arrays;

public class TestColecciones {
    public static void main(String[] args) {
        ColeccionAleatoria c = new ColeccionAleatoria();
        System.out.println(c.getArrayInt());
        System.out.println(Arrays.toString(c.getArrayInt()));
        System.out.printf("Valor del valor medio %.2f%n",
                c.getValorMedio());
        System.out.printf("Valor del desviación típica %.2f%n",
                c.calcularDesviacionTipica());
        System.out.println(Arrays.toString(c.devolverValoresPares()));
        System.out.printf("Valor mas grande %d y mas pequeño %d%n",
         c.obtenerValorMaximo(), c.obtenerValorMinimo());
         c.getArrayInt()[0]= 100; //con el getter modifico el array
        System.out.println(Arrays.toString(c.getArrayInt()));
       // c.getValorMedio() = 5; obtenemos el contenido de esa posición
        //de memoria, no la posición de memoria

        System.out.println("......................................");
        ListaAleatoria lista = new ListaAleatoria();
        System.out.println(lista.getListaEnteros());
        System.out.printf("Valor del valor medio %.2f%n",
                lista.getValorMedio());
        System.out.printf("Valor del desviación típica %.2f%n",
                lista.calcularDesviacionTipica());
        System.out.println(lista.devolverValoresPares());
        System.out.printf("Valor mas grande %d y mas pequeño %d%n",
                lista.obtenerValorMaximo(), lista.obtenerValorMinimo() );
        lista.getListaEnteros().set(0,100);
        System.out.println(lista.getListaEnteros());

    }
}
