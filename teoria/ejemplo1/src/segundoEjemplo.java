import java.util.Arrays;

public class segundoEjemplo {
    public static void main(String[] args) {
        //inicializando arrays
        float[] numeros = {1, 3.2f, 4, 5.74f};
        System.out.println(Arrays.toString(numeros));
        String[] palabras = {"uno", "dos", "tres"};
        System.out.println(Arrays.toString(palabras));
        boolean[] boleanos = {true, false, true, 5 > 9, 6 * 9 > 5 && 45 / 6 < 3};
        System.out.println(Arrays.toString(boleanos));
        //recorrer arrays
        //forma clásica
         System.out.println("================================");
        for (int i = 0; i < palabras.length ; i++) {
             System.out.println(palabras[i]);
        }
        //foreach, bucle mejorado
        for (float numero: numeros) {
            System.out.printf("Valor del float %.2f%n", numero);
        }
         System.out.println("Último elemento de colección " + palabras[palabras.length - 1]); //mostrar el último elemento
        for (boolean b: boleanos) {
            System.out.printf("Valor boolean: %B%n", b);
        }
        for (String string: palabras) {
            System.out.printf("Palabras %S%n" , string);
        }
        //Creamos objetos Persona
        Persona p1 = new Persona("juan garcía", 23);
        Persona p2 = new Persona("francisco garcía", 11);
        Persona p3 = new Persona("juan gómez", 99);
        Persona[] personas = {p1, p2, p3};
        for (Persona p : personas) {
            System.out.println(p);
        }
        System.out.printf("La edad de la primera persona de la colección es %d%n",
                personas[0].getEdad());

        //¿Cuál es el nombre de la persona de mayor edad?
        int edadMasGrande = Integer.MIN_VALUE;
        Persona personaMasEdad = null;
        for (Persona p: personas) {
            if (p.getEdad() > edadMasGrande){
                edadMasGrande = p.getEdad(); // cambio la edad mas grande
                personaMasEdad = p;
            }
        }
        if (personaMasEdad != null)
            System.out.printf("La persona de mas edad se llama %S y tiene una edad de %d%n",
                            personaMasEdad.getNombreCompleto(), personaMasEdad.getEdad());
    }
}

