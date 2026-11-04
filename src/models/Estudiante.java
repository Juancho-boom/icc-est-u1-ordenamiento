package models;

import java.util.Comparator;

// Una clase Estudiante

// Con 2 atributos
// Setters y Getters

public class Estudiante implements Comparable<Estudiante>{
    private String name;
    private double nota;

    public Estudiante(String name, double nota) {
        this.name = name;
        this.nota = nota;
    }
    

    public Estudiante() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante [name=" + name + ", nota=" + nota + "]";
    }



    /**
     * 1. Nota Ascendente
     * 2. Nota Ascendetne en el caso de que las notas sean iguales
     * @param o objeto tiipo Estudiante con el cual voy a comparar
     * @return indice de comparacion( + , - , 0 )
     */
    /*@Override
    public int compareTo(Estudiante e2) {
        int compN = Double.compare(this.getNota(), e2.getNota());

        if (compN != 0) {
            return compN;           
        }

        return this.getName().compareTo(e2.getName());
    }
    */


    @Override
    public int compareTo(Estudiante e2) {
        return Comparator.comparingDouble(Estudiante:: getNota).thenComparing(Estudiante:: getName).compare(this, e2);
    }

}
