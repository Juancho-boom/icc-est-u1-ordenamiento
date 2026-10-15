public class App {
  
    public static void main(String[] args) throws Exception {
        int[] original = {5,3,4,1,2};
        int[] b = original.clone(); // b es una copia del original
        int[] c = original; // c es una referencia al original

        // Usar el metodo del archivo(clase) Bubble 
        // Instanciar el archivo bubble
        // Instanciar la clase bubble

        Bubble bubble = new Bubble(); // new es la parte de la instancia de bubble
     
        //Ejecutar codigo del archivo bubble uso de la instancia
        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);
    }

    public static void printArreglo(int[] arr){
        for(int i =0 ; i < arr.length; i++)
            System.out.print(arr[i] + " - ");
        System.out.println();
        
    }
}