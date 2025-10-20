public class App {
    public static void main(String[] args) throws Exception { 
        int[] numeros = {10, 0, -5, 5, 15, 2};

        /// CREA LA CLASE == INSTANCIAR LA CLASE CON VALOR
        /// SortBubble y = new SortBubble();
        SortBubble claseSortBubble = new SortBubble();

        // MOSTRAR EL ARREGLO ORIGINAL
        System.out.println("Arreglo original:");
        claseSortBubble.printArray(numeros); // IMPRIME
        System.out.println();

        // ORDENAR ASCENDENTE
        claseSortBubble.sortAscendente(numeros); // ORDENA
        System.out.println("Ordenado ascendente:");
        claseSortBubble.printArray(numeros); // IMPRIME
        System.out.println();

        // ORDENAR DESCENDENTE
        claseSortBubble.sortDescendente(numeros); // ORDENA
        System.out.println("Ordenado descendente:");
        claseSortBubble.printArray(numeros); // IMPRIME
        System.out.println();
    }     
}
