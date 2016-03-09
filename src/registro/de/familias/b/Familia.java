/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro.de.familias.b;
import java.util.*;
/**
 *
 * @author dieguischa
 */
public class Familia {
    private ArrayList<Persona> integrantes;
    private String apellido; 
    private int cantidadIntegrantes; 
    
    public Familia(){
        this.integrantes= new ArrayList<Persona>();
        java.util.Scanner lectura= new java.util.Scanner(System.in);
        System.out.println("Ingrese cantidad de hijos");
        int cantidadHijos=lectura.nextInt();
        System.out.println("Ingrese el apellido: ");
        String apellido= lectura.next();
        System.out.println("Ingrese el nombre del padre: ");
        String nombre= lectura.next();
        System.out.println("Ingrese la edad del padre: ");
        int edad= lectura.nextInt();
        Persona padre= new Persona(nombre, apellido,"Masculino", "Padre", edad);
        integrantes.add(padre);
        System.out.println("Ingrese el nombre de la madre: ");
        nombre= lectura.next();
        System.out.println("Ingrese la edad de la madre: ");
        edad= lectura.nextInt();
        Persona madre= new Persona(nombre, apellido,"Femenino", "Madre", edad);
        integrantes.add(madre);
        for (int i = 0; i < cantidadHijos; i++) {
        System.out.println("Ingrese el nombre del hijo: ");
        nombre= lectura.next();
        System.out.println("Ingrese la edad del hijo: ");
        edad= lectura.nextInt();
        System.out.println("Ingrese el genero del hijo");
        String genero=lectura.next();
        Persona hijo= new Persona(nombre, apellido, genero, "Hijo", edad);
        integrantes.add(hijo);
        }
       
        this.cantidadIntegrantes=cantidadHijos+2;
        this.apellido=apellido; 
    }



    public String getApellido() {
        return apellido;
    }

    public int getCantidadIntegrantes() {
        return cantidadIntegrantes;
    }
    
     public Persona getIntegrante(int i){
         return integrantes.get(i);
     }
    
}
