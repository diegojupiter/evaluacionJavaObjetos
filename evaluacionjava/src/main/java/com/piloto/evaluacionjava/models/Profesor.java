package com.piloto.evaluacionjava.models;

public class Profesor {

    //Atributos
    public String nombreProf;
    public String materia;
    
  
    
    //Constructores
    public Profesor() {
    }

    public Profesor(String nombreProf, String materia) {
        this.nombreProf = nombreProf;
        this.materia = materia;
    }


    //Getters and Setters
    public String getNombreProf() {
        return nombreProf;
    }

    public void setNombreProf(String nombreProf) {
        this.nombreProf = nombreProf;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }


    //toString
    @Override
    public String toString() {
        return "Profesor [nombreProf=" + nombreProf + ", materia=" + materia + "]";
    }

}
