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
        System.out.println("\n Comparadores ");
        ejmplo1();
    }

    private void ejmplo1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ejmplo1'");
    }
    
}
