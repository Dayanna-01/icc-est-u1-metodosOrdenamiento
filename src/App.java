public class App {
    public static void main(String[] args) {
        int[] numeros = {10, 0, -5, 5, 15, 2};

        SortBubble sortBubble = new SortBubble();

        // Mostrar el arreglo original
        System.out.print("Arreglo original: ");
        System.out.println();
        sortBubble.printArray(numeros);

    }
}
