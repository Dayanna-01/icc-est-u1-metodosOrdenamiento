public class App {
    public static void main(String[] args) throws Exception { 
        System.out.println("Dayanna Chacha\n");

        SortBubble claseSortBubble = new SortBubble();
        SortSelection claseSortSelection = new SortSelection();
        SortInsertion claseSortInsertion = new SortInsertion();

        //   SORT BUBBLE
        /*int[] numeros = {10, 0, -5, 5, 15, 2};
        System.out.println("1. SORT BUBBLE ");
        System.out.print("Arreglo original: ");
        claseSortBubble.printArray(numeros);
        System.out.println();

        // Ordenar ascendente
        claseSortBubble.sortAscendente(numeros);
        System.out.print("Ordenado ascendente: ");
        claseSortBubble.printArray(numeros);
        System.out.println();

        // Ordenar descendente
        claseSortBubble.sortDescendente(numeros);
        System.out.print("Ordenado descendente: ");
        claseSortBubble.printArray(numeros);
        System.out.println();*/


        //   SORT SELECTION
        /*int[] numeros2 = {10, 0, -5, 5, 15, 2};
        System.out.println("2. SORT SELECTION ");
        System.out.print("Arreglo original: ");
        claseSortSelection.printArray(numeros2);
        System.out.println();

        // Ordenar ascendente
        claseSortSelection.sortAscendente(numeros2);
        System.out.print("Ordenado ascendente: ");
        claseSortSelection.printArray(numeros2);
        System.out.println();

        // Ordenar descendente
        claseSortSelection.sortDescendente(numeros2);
        System.out.print("Ordenado descendente: ");
        claseSortSelection.printArray(numeros2);
        System.out.println();


        //   SORT INSERTION
        int[] numeros3 = {10, 0, -5, 5, 15, 2};
        System.out.println("3. SORT INSERTION ");
        System.out.print("Arreglo original: ");
        claseSortInsertion.printArray(numeros3);
        System.out.println();;

        // Ordenar ascendente
        claseSortInsertion.sortAscendente(numeros3, true); //poner true para mostrar
        System.out.print("Ordenado ascendente: ");
        claseSortInsertion.printArray(numeros3);
        System.out.println();

        // Ordenar descendente
        claseSortInsertion.sortDescendente(numeros3);
        System.out.print("Ordenado descendente: ");
        claseSortInsertion.printArray(numeros3);
        System.out.println();*/

        // SORT BY NAME
        String[] nombres = {"Pedro", "Ana", "Maria", "Luis", "Juan"};
        /*System.out.println("Array de nombres original:");
        claseSortInsertion.printArrayNombres(nombres);

        // Ordenar ascendente
        claseSortInsertion.sortAscendente(nombres, false);
        System.out.println("\nOrdenado ascendente por nombre:");
        claseSortInsertion.printArrayNombres(nombres);

        // Ordenar descendente
        claseSortInsertion.sortDescendente(nombres, false);
        System.out.println("\nOrdenado descendente por nombre:");
        claseSortInsertion.printArrayNombres(nombres);
        System.out.println();*/
        
        // PERSONA
        //System.out.println("SORT INSERTION CON EDAD");
        Persona[] personas = new Persona[]{
            new Persona("Pedro", 30),
            new Persona("Ana", 25),
            new Persona("Maria", 28),
        };

        System.out.println("Array de Personas Original: ");
        claseSortInsertion.printArrayPersonas(personas);
        /*System.out.println("\nOrdenado por Edad de Personas:");
        claseSortInsertion.sortPersonasByAge(personas);
        claseSortInsertion.printArrayPersonas(personas);*/

        System.out.println("\nOrdenado por Nombre de Personas:");
        claseSortInsertion.sortPersonasByName(personas);
        claseSortInsertion.printArrayPersonas(personas);

    }     
}
