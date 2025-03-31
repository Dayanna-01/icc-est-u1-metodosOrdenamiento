public class MetodoInsercion {
    // Método para ordenar de forma ascendente
    public int ordenarAsd(int[] arreglo, boolean pasos) {
        int tam = arreglo.length;
        int contComparaciones = 0;
        for (int i = 1; i < tam; i++) {
            int aux = arreglo[i];
            int j = i - 1;
            if (pasos) {
                System.out.println("i: " + i + " j: " + j + " aux: " + aux);
            }
            contComparaciones++;
            while (j >= 0 && arreglo[j] > aux) {
                if (pasos) {
                    System.out.println("Compara aux: " + aux + " con arreglo[" + j + "]: " + arreglo[j]);
                }
                arreglo[j + 1] = arreglo[j];  // Mueve el elemento hacia la derecha
                j = j - 1;

                if (pasos) {
                    imprimirArreglo(arreglo);
                    System.out.println("Mueve arreglo[" + (j + 1) + "] a arreglo[" + (j + 2) + "]");
                }

                contComparaciones++; // Aumento de comparaciones dentro del while
            }
            arreglo[j + 1] = aux; // Coloca el elemento auxiliar en su posición correcta
        }
        return contComparaciones; // Retorna el número de comparaciones
    }

    // Método para ordenar de forma descendente
    public void ordenarDes(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            int aux = arreglo[i];
            int j = i - 1;

            while (j >= 0 && arreglo[j] < aux) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = aux;
        }
    }

    // Método para imprimir el arreglo
    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }
}
