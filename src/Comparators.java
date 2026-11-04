import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import models.Estudiante;

public class Comparators {

    private List<Estudiante> estList;
    private Estudiante[] estArray;

    

    public Comparators() {
        Estudiante e1 = new Estudiante("Juan", 10);
        estArray = new  Estudiante[] {e1,new Estudiante("Maria", 7),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 7),
            new Estudiante("Pedro", 6.8)
        };
        estList = new ArrayList<>(List.of(estArray));
        System.out.println("\n Comparadores ");
        // LLAMADAS A LOS EJMPLOS
        ejemplo1();
        ejemplo2();
        ejemplo3();
        ejemplo4();
        ejemplo5();
        ejemplo6();
        ejemplo7();
        ejemplo8();
        ejemplo9();
        ejemplo10();
    }

    

    private void print(List<Estudiante> list){
        // for est in list:
        for(Estudiante e : list){
            System.out.println(e);
        }
    } 

    /**
     * Comparator -> por valor
     * Lamba directa: nota ascendete 
     * */ 

    public void ejemplo1(){
        // COPIAR EL ARREGLO GLOBAL 
        List<Estudiante> lista =new ArrayList<>(estList);
        // Comparator ->  Obj != (Envolvente de primitivo ni String)
        Comparator<Estudiante> comparador = Comparator.comparingDouble(x -> x.getNota());
        lista.sort(comparador);
        // imprimir
        print(lista);

    }


    public void ejemplo2(){
        System.out.println("Ejemplo 2");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparingDouble(Estudiante :: getNota);
        lista.sort(comparator);
        print(lista);
    }

    /**
     * Ordenar porNota desendente
     */
    public void ejemplo3(){
        System.out.println("Ejemplo 3");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparingDouble(Estudiante :: getNota).reversed();
        lista.sort(comparator);
        print(lista);
    }

    private void ejemplo4() {
        System.out.println("Ejemplo 4");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparing(Estudiante :: getName);
        lista.sort(comparator);
        print(lista);
    }

    /**
     * Comparator -> Dos Items
     * */ 
    private void ejemplo5() {
        System.out.println("Ejemplo 5");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = (e1,e2) -> Double.compare(e1.getNota(), e2.getNota());
        lista.sort(comparator);
        print(lista);
    }

    /**
     * Comparator -> Dos Items
     * */ 
    private void ejemplo6() {
        System.out.println("Ejemplo 6");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = (e1,e2) -> e1.getName().compareTo(e2.getName());
        lista.sort(comparator);
        print(lista);
    }
    
    private void ejemplo7() {
       System.out.println("Ejemplo 7");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = (e1,e2) -> Double.compare(e2.getNota(), e1.getNota());
        lista.sort(comparator);
        print(lista);
    }

    /**
     * Comparar nota por asendente y si empatan ordenar nombre desendente
     *  */    
    private void ejemplo8() {
       System.out.println("Ejemplo 8");
        List<Estudiante> lista = new ArrayList<>(estList);
        
        Comparator<Estudiante> comparator = (e1,e2) -> {
            if (e1.getNota() == e2.getNota()) {
                return e1.getName().compareTo(e2.getName());
            }
            return Double.compare(e2.getNota(), e1.getNota());
        };
        lista.sort(comparator);
        print(lista);
    }
    /** Ordenar por nota asendete y por nombre asendente
     * Comparator -> por valor
     * referencias dos comparadores
     */
    private void ejemplo9() {
       System.out.println("Ejemplo 9");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator
                .comparingDouble(Estudiante::getNota )
                .thenComparing(Estudiante::getName);
        lista.sort(comparator);
        print(lista);
    }

     /** Ordenar por nota desendete y por nombre asendente
     * Comparator -> por valor
     * 1 comparator lambda
     * 2 comparar referecias
     */
    private void ejemplo10() {
       System.out.println("Ejemplo 10");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparing(Estudiante::getNota).reversed().thenComparing(Estudiante::getName);
        lista.sort(comparator);
        print(lista);
    }
}
