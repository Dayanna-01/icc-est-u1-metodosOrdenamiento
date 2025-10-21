public class SortSelection {
    
    public SortSelection() {
        //Constructor vacio 
    }

    public void sortAscendente(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            if (i != indiceMenor) {
                int aux = numeros[indiceMenor];
                numeros[indiceMenor] = numeros[i];
                numeros[i] = aux;
            }
        }
    }

    public void sortDescendente(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            int indice = i;

            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] > numeros[indice]) { //se cambia el signo aqui para cambiar el orden
                    indice = j;
                }
            }

            if (i != indice) {
                int aux = numeros[indice];
                numeros[indice] = numeros[i];
                numeros[i] = aux;
            }
        }
    }

    public void printArray(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) {
                System.out.print(numeros[i]);
            } else {
                System.out.print(numeros[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
