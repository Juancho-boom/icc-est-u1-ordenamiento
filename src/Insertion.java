public class Insertion {
    public void sort(int[] arreglo){
        for(int i = 1; i < arreglo.length; i++){
            int key = arreglo[i];
            int j = i-1;    
            while (j >= 0 && arreglo[j] < key){
                arreglo[j + 1 ] = arreglo[j];
                j--;
                System.out.println("El aux= " + key + " se inserta en pos" + (j+1));
            }
            
            arreglo[j + 1] = key;
        }
        System.out.println("Ordenado Des");
        
    }
}
