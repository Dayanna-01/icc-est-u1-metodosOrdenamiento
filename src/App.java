public class App {
    public static void main(String[] args) throws Exception { 
        System.out.println("Dayanna Chacha\n");

        SortBubble claseSortBubble = new SortBubble();
        SortSelection claseSortSelection = new SortSelection();

        //   SORT BUBBLE
        int[] numeros = {10, 0, -5, 5, 15, 2};
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
        System.out.println();


        //   SORT SELECTION
        int[] numeros2 = {10, 0, -5, 5, 15, 2};
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
    }     
}
