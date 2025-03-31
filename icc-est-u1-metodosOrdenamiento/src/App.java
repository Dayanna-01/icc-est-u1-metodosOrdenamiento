import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int[] arreglo = {10, 9, 21, 5, 15, 2, -1, 0};

        //int[] arreglo = new int[10000];
        MetodoBurbuja metodoBurbujaClase = new MetodoBurbuja(); // Instanciar una clase o llamar al método
        MetodoSeleccion mS = new MetodoSeleccion();
        MetodoInsercion mI = new MetodoInsercion();
        MetodoBurbujaMejorado mBM = new MetodoBurbujaMejorado();

        boolean conPasos = true;
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Llenar el arreglo con valores aleatorios
            /*for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = (int) (Math.random() * 10000) + 1;
            }*/

            System.out.println("\nSeleccione el método de ordenamiento:");
            System.out.println("1. Burbuja");
            System.out.println("2. Selección");
            System.out.println("3. Inserción");
            System.out.println("4. Burbuja Mejorado");
            System.out.println("5. Salir");

            //int metodo = scanner.nextInt();
            int metodo = getPositive(scanner, "\tIngrese la opción: ");
            if (metodo == 5) {
                System.out.println("Adiós");
                continuar = false;
                break;
            }
            System.out.println("¿Desea ver los pasos? (true/false):");
            conPasos = scanner.nextBoolean();
            //System.out.println("¿Desea ordenar ascendentemente (A) o descendentemente (B)?");
            //String orden = scanner.next();
            //boolean ascendente = orden.equalsIgnoreCase("A");
            String[] posibles ={"A", "D"};
            String orden = getValidString(scanner, posibles, "¿Desea ordenar ascendentemente (A) o descendentemente (D)?");
            boolean ascendente = orden.equalsIgnoreCase("A");

            int contComparaciones = 0; // Para el método de inserción
            int[] resultados; // Para el método de burbuja mejorado

            switch (metodo) {
                case 1:
                    System.out.println("Método Burbuja");
                    System.out.print("Arreglo Original-> ");
                    metodoBurbujaClase.imprimirArreglo(arreglo);
                    contComparaciones = mI.ordenarAsd(arreglo, conPasos);
                    System.out.print("Arreglo Ordenado-> ");
                    metodoBurbujaClase.imprimirArreglo(arreglo);
                    System.out.println("Comparaciones -> " + contComparaciones);
                    break;
                case 2:
                    System.out.println("Método Selección");
                    System.out.print("Arreglo Original-> ");
                    mS.imprimirArreglo(arreglo);
                    contComparaciones = mI.ordenarAsd(arreglo, conPasos);
                    System.out.print("Arreglo Ordenado-> ");
                    mS.imprimirArreglo(arreglo);
                    System.out.println("Comparaciones -> " + contComparaciones);
                    break;
                case 3:
                    System.out.println("Método Inserción");
                    System.out.print("Arreglo Original-> ");
                    mI.imprimirArreglo(arreglo);
                    contComparaciones = mI.ordenarAsd(arreglo, conPasos);
                    System.out.print("Arreglo Ordenado-> ");
                    mI.imprimirArreglo(arreglo);
                    System.out.println("Comparaciones -> " + contComparaciones);
                    break;
                case 4:
                    System.out.println("Método Burbuja Mejorado");
                    System.out.print("Arreglo Original-> ");
                    mBM.imprimirArreglo(arreglo);
                    resultados = mBM.ordenarAscendente(arreglo);
                    System.out.print("Arreglo Ordenado-> ");
                    mBM.imprimirArreglo(arreglo);
                    System.out.println("Comparaciones -> " + resultados[0]);
                    System.out.println("Cambios -> " + resultados[1]);
                    break;
                default:
                    System.out.println("Opción Incorrecta");
                    break;
            }
        }
    }
    public static int getPositive(Scanner scanner, String message) {
        int number;
        do{
            System.out.println(message +": ");
            number = scanner.nextInt();
            if (number <=0){
                System.out.println("El numero debe ser positivo...Intente de nuevo");
            }
        } while(number<=0);
        return number;
    } 

    public static String getValidString (Scanner scanner, String[] posibles, String message){
        String input;
        boolean valido;
        do{
            System.out.print(message + ": ");
            input =scanner.next();
            valido = false;
            for(String posible : posibles){
                if(input.equalsIgnoreCase(posible)){
                    valido = true;
                }
            }
        }while(!valido);
        return input;
    }
}
