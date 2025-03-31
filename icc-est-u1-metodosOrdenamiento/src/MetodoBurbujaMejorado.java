public class MetodoBurbujaMejorado {
    
    // Método que ordena el arreglo y devuelve el número de comparaciones realizadas
    public int[] ordenarAscendente(int[] arreglo) {
        int n = arreglo.length;
        int contComparaciones = 0;  // Contador de comparaciones
        int contCambios = 0;         // Contador de cambios realizados

        // Ciclo exterior que recorre el arreglo
        for (int i = 0; i < n - 1; i++) {
            // El ciclo interno solo se ejecuta hasta n - 1 - i para evitar comparar elementos ya ordenados
            for (int j = 0; j < n - 1 - i; j++) {
                contComparaciones++;  // Incrementa las comparaciones

                if (arreglo[j] > arreglo[j + 1]) { // Orden ascendente
                    int aux = arreglo[j];
                    contCambios++;
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        // Retorna un arreglo con el número de comparaciones y el número de cambios
        int[] respuestas = {contComparaciones, contCambios};
        return respuestas;
    }

    // Método para imprimir el arreglo
    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }
}
