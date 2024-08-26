import java.awt.*;
import java.util.ArrayList;

public class DATA {

    //BASE DE DATOS
    public static ArrayList listaDeAlumnos(){

        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Mynor","Biato",15));
        alumnos.add(new Alumno("Diego","Calderas",16));
        alumnos.add(new Alumno("Hector","Soto",15));
        alumnos.add(new Alumno("Andre","Toc",16));
        alumnos.add(new Alumno("Samuel","Chavez",18));
        return alumnos;
    }

}
