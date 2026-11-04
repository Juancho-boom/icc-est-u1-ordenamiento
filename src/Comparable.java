import java.util.ArrayList;
import java.util.List;

import models.Estudiante;

public class Comparable {

    private List<Estudiante> estList;
    private Estudiante[] estArray;

    public Comparable() {
        Estudiante e1 = new Estudiante("Juan", 10);
        estArray = new  Estudiante[] {e1,new Estudiante("Maria", 7),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 7),
            new Estudiante("Pedro", 6.8)
        };
        estList = new ArrayList<>(List.of(estArray));
        System.out.println("\n Comparables ");

        ejmplo1();
        ejemplo2();
        ejemplo3();
    }


    //Orden natural DESCENDENTE
    //Comparable -> orden natural invetido
    private void ejemplo3() {
        System.out.println("Ejemplo 3");
        List<Estudiante> listDes = new ArrayList<>(estList);
        listDes.sort(null);
        print(listDes.reversed());
    }

    //Orden Natural
    private void ejemplo2() {
        System.out.println("Ejemplo 2");
        List<Estudiante> list = new ArrayList<>(estList);
        list.sort(null);
        print(list);

        
    }

    private void print(List<Estudiante> list) {
        for(Estudiante e : list){
            System.out.println(e);
        }
    }

    private void ejmplo1() {

        System.out.println("Ejemplo 1");
        int x = 10; 
        int y = 20; 
        int compInt = Integer.compare(x, y);


        String a = "Hola"; 
        String b = "hola";
        int compStr = a.compareTo(b);


        Estudiante e1 = estList.get(0);
        Estudiante e2 = estList.get(1);
        int compEst = e1.compareTo(e2);
        estList.sort(null);
        print(estList);
    }
    
}
