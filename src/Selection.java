public class Selection {
    public void sort(int[] arreglo){
        int cambios = 0;
        int comparaciones = 0;

        for(int i =0; i < arreglo.length -1; i++){
            int minimo = i;
            System.out.println("Pasada: " + i);
            
            for(int j = i +1; j < arreglo.length; j ++){
                comparaciones++;
                if(arreglo[j] < arreglo[minimo]){
                    minimo = j;
                } 
            }
            if (minimo != i) {
                cambios++;
                int aux = arreglo[i];
                arreglo[i] = arreglo[minimo];
                arreglo[minimo] = aux;
            }
            System.out.println("Cambios: " + cambios);
            System.out.println("Comparaciones: "+ comparaciones);
        }

        System.out.println("Cambios: " + cambios);
        System.out.println("Comparaciones: "+ comparaciones);
    }
}
