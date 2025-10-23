public class SortInsertion {

    public SortInsertion() {
        // Constructor vacío
    }

    public void sortAscendente(int[] numeros, boolean pasos) {
        for (int i = 1; i < numeros.length; i++) {
            int aux = numeros[i];
            int j = i - 1;

            if (pasos) {
                System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
            }
            while (j >= 0 && numeros[j] > aux) { //aqui se le hace el cambio
                if (pasos)
                    System.out.println("Compara aux: " + aux + "con numeros[" + j + "]: " + numeros[j]);

                numeros[j + 1] = numeros[j];
                if (pasos)
                    printArray(numeros);
                j--;
                if (pasos)
                    System.out.println("Mueve numeros[" + (j + 1) + "] a numeros[" + (j + 2) + "]");
            }
            numeros[j + 1] = aux;
            if (pasos) {
                System.out.println("Inserta aux: " + aux + "en la posicion " + (j + 1));
                System.out.println("Estado actual: ");
                printArray(numeros);
                
            }
        }
    }

    public void sortDescendente(int[] numeros) {
        for (int i = 1; i < numeros.length; i++) {
            int aux = numeros[i];
            int j = i - 1;

            while (j >= 0 && numeros[j] < aux) { //aqui se le hace el cambio
                numeros[j + 1] = numeros[j];
                j--;
            }
            numeros[j + 1] = aux;
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

    // SORT BY NAME
    public void sortAscendente(String[] nombres, boolean pasos) {
        for (int i = 1; i < nombres.length; i++) {
            String aux = nombres[i];
            int j = i - 1;

            if (pasos)
                System.out.println("\ni: " + i + ", aux: " + aux);

            while (j >= 0 && nombres[j].compareTo(aux) > 0) {
                if (pasos)
                    System.out.println("Compara " + aux + " con nombres[" + j + "]: " + nombres[j] + " → se mueve " + nombres[j] + " a la derecha");

                nombres[j + 1] = nombres[j];
                j--;

                if (pasos) {
                    System.out.print("Estado actual: ");
                    printArrayNombres(nombres);
                }
            }

            nombres[j + 1] = aux;

            if (pasos) {
                System.out.println("Inserta " + aux + " en la posición " + (j + 1));
                System.out.print("Estado después de inserción: ");
                printArrayNombres(nombres);
            }
        }
    }

    public void sortDescendente(String[] nombres, boolean pasos) {
        for (int i = 1; i < nombres.length; i++) {
            String aux = nombres[i];
            int j = i - 1;

            if (pasos)
                System.out.println("\ni: " + i + ", aux: " + aux);

            while (j >= 0 && nombres[j].compareTo(aux) < 0) {
                if (pasos)
                    System.out.println("Compara " + aux + " con nombres[" + j + "]: " + nombres[j] + " → se mueve " + nombres[j] + " a la derecha");

                nombres[j + 1] = nombres[j];
                j--;

                if (pasos) {
                    System.out.print("Estado actual: ");
                    printArrayNombres(nombres);
                }
            }

            nombres[j + 1] = aux;

            if (pasos) {
                System.out.println("Inserta " + aux + " en la posición " + (j + 1));
                System.out.print("Estado después de inserción: ");
                printArrayNombres(nombres);
            }
        }
    }


    public void printArrayNombres(String[] nombres) {
        System.out.print("[");
        for (int i = 0; i < nombres.length; i++) {
            if (i == nombres.length - 1) {
                System.out.print(nombres[i]);
            } else {
                System.out.print(nombres[i] + ", ");
            }
        }
        System.out.println("]");
    }


    // SORT BY EDAD
    public void sortPersonasByName(Persona[] personas) {
    for (int i = 1; i < personas.length; i++) {
        int j = i - 1;
        Persona aux = personas[i];

        while (j >= 0 && aux.getName().compareTo(personas[j].getName()) < 0) {
            personas[j + 1] = personas[j];
            j--;
        }
        personas[j + 1] = aux;
    }
}

    public void sortPersonasByAge(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            int j = i - 1;
            Persona aux = personas[i];
            while (j >= 0 && aux.getAge() < personas[j].getAge()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;
        }
    }

    public void printArrayPersonas(Persona[] personas) {
        System.out.print("[");
        for (int i = 0; i < personas.length; i++) {
            if (i == personas.length - 1) {
                System.out.print(personas[i]);
            } else {
                System.out.print(personas[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
