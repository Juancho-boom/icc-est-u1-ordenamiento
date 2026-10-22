import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

import models.Estudiante;

public class App {
  
    public static void main(String[] args) throws Exception {
       //runEjemplosPrimitivos();
       runEjemplosObjetos();
       System.out.println("------------------------------------------------");
       runComparetors();
    }



    private static void runComparetors() {
        
        Integer[] original = {5,6,4,1,2,3};
        Arrays.sort(original);
         System.out.println("\n\t ----Sort----");
        for(int i = 0; i < original.length; i++){
           
            System.out.println(original[i]);
        }

        Arrays.sort(original, Comparator.reverseOrder());
        System.out.println("\n\t ----Sort reversa ----");
        for(int i = 0; i < original.length; i++){
           
            System.out.println(original[i]);
        }
    }



    private static void runEjemplosObjetos() {
        
        //e1.getName();
        //e1.setName("Maria");
        Estudiante e1 = new Estudiante("Juan", 10);
        Estudiante[] estudiantes = {e1,new Estudiante("Maria", 7),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 6.8)
        };

        Bubble bubble = new Bubble();
        System.out.println("\n \t----Orden----");

        System.out.println("\n \tOriginal");
        printArregloEst(estudiantes);

        bubble.sortEstudiantes(estudiantes);
        System.out.println("\n \tArreglado");
        printArregloEst(estudiantes);
        
        
        
    }


    
    public static void runEjemplosPrimitivos(){
         int[] original = {5,6,4,1,2,3};
        int[] b = original.clone(); // b es una copia del original
        int[] c = original.clone(); // c es una referencia al original
        int[] d = original.clone();

        // Usar el metodo del archivo(clase) Bubble 
        // Instanciar el archivo bubble
        // Instanciar la clase bubble

        Bubble bubble = new Bubble(); // new es la parte de la instancia de bubble
     
        //Ejecutar codigo del archivo bubble uso de la instancia
        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);

        System.out.println("\n");
        System.out.println("----Selection----");
        Selection seletion = new Selection();
        printArreglo(c);
        seletion.sort(c);
        printArreglo(c);
        //s

        System.out.println("\n");
        System.out.println("----Insetion----");
        Insertion insertion = new Insertion();
        printArreglo(d);
        insertion.sort(d);
        printArreglo(d);
    }
   


    public static void printArreglo(int[] arr){
        for(int i =0 ; i < arr.length; i++)
            System.out.print(arr[i] + " - ");
            System.out.println();
        
    }

    public static void printArregloEst(Estudiante[] estudiantes){
        for(int i =0 ; i < estudiantes.length; i++){
            System.out.print(estudiantes[i] + " - ");
            System.out.println();
        }
    }
}