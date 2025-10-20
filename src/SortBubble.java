public class SortBubble{

    public SortBubble(){
        
    }
    

    public void sortAscendente(int[] numeros){
        int contCambios = 0;
        int contPreguntas = 0;

        for (int i = 0; i < numeros.length - 1; i++) {
            boolean hayCambio = false; 
            for(int j = 0; j < numeros.length - 1 - i; j++){
                contPreguntas ++;

                if(numeros[j] >  numeros[j + 1]){ // no se cambia aqui
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    contCambios ++;
                    hayCambio = true;
                }
            }
            if(!hayCambio){
                break;
            }
        }
    }


    public void sortDescendente(int[] numeros){
        int contCambios = 0;
        int contPreguntas = 0;
        
        for (int i = 0; i < numeros.length - 1; i++) {
            boolean hayCambio = false;
            for(int j = 0; j < numeros.length - 1 - i; j++){
                contPreguntas++;
                
                if(numeros[j] < numeros[j + 1]){ // Cambio aquí
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    contCambios++;
                    hayCambio = true;
                }
            }
            if(!hayCambio){
                break;
            }
        }
    }


    public void printArray(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) {
                System.out.print(numeros[i]);
            }else
                System.out.print(numeros[i] + " , ");
        }
        System.out.println("]");
    }

}