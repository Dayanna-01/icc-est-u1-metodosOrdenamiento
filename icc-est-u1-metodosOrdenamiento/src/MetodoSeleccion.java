public class MetodoSeleccion {
    public void ordenar(int[] arreglo, boolean ascendente) {
        if (ascendente) {
            ordenarAsdSeleccion(arreglo); // Orden ascendente
        } else {
            ordenarDeSeleccion(arreglo); // Orden descendente
        }
        imprimirArreglo(arreglo);
    }

    public void ordenarDeSeleccion(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] > arreglo[maxIdx]) { // Comparación corregida
                    maxIdx = j;
                }
            }
            if (maxIdx != i) {
                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i] = aux;
            }
        }
        imprimirArreglo(arreglo);
    }

    public void ordenarAsdSeleccion(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[minIdx]) { // Comparación corregida
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int aux = arreglo[minIdx];
                arreglo[minIdx] = arreglo[i];
                arreglo[i] = aux;
            }
        }
        imprimirArreglo(arreglo);
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
