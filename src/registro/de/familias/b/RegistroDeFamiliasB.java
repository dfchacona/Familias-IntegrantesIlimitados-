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
public class RegistroDeFamiliasB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a=0; 
       int eleccion=1;
        java.util.Scanner lectura= new java.util.Scanner(System.in);
        HashMap<String, Familia> familias= new HashMap<String, Familia>();
       do{
        System.out.println("Ingrese: "
                + "\n1. Para registrar familia"
                + "\n2. Para ubicar familia por apellido"
                + "\n3. Para ubicar un miembro de familia"
                + "\n0 Para terminar el programa");
        eleccion= lectura.nextInt();
        switch (eleccion){
            case(1):
            Familia f1= new Familia();
            familias.put(f1.getApellido(), f1);
            break;
            
            case(2):
            System.out.println("Ingrese apellido que desea ubicar: ");
            String apellido=lectura.next();
            f1=familias.get(apellido);
            if(f1!=null){
                for(int i=0; i<f1.getCantidadIntegrantes();i++){
                 if(i==0||i==1){   
                 System.out.println(f1.getIntegrante(i).getRol()+": \nNombre: "+f1.getIntegrante(i).getNombre()+"\nEdad:"+f1.getIntegrante(i).getEdad());
                 }else{
                     int j=1;
                 System.out.println("Hijo: \nNombre: "+f1.getIntegrante(i).getNombre()+"\nEdad:"+f1.getIntegrante(i).getEdad()+"\nGenero: "+f1.getIntegrante(i).getSexo());    
                 j++;
                 }}
                }
           
            else{
                System.out.println("Familia inexistente");
            }
            break;
            case(3):
            System.out.println("Ingrese apellido de la familia: ");
            apellido=lectura.next();
            f1=familias.get(apellido);
            if(f1!=null){
            System.out.println("Ingrese nombre del integrante que desea ubicar: ");
            String nombre=lectura.next();
            
            if(f1.getIntegrante(0).getNombre().equals(nombre)){
            System.out.println("Integrante solicitado: \nNombre: "+f1.getIntegrante(0).getNombre()+"\nEdad:"+f1.getIntegrante(0).getEdad());
            System.out.println("Esposa: \nNombre: "+f1.getIntegrante(1).getNombre()+"\nEdad:"+f1.getIntegrante(1).getEdad());
                for (int i = 2; i < f1.getCantidadIntegrantes(); i++) {
                    System.out.println("Hijo: \nNombre: "+f1.getIntegrante(i).getNombre()+"\nEdad:"+f1.getIntegrante(i).getEdad()+"\nGenero: "+f1.getIntegrante(i).getSexo());
                }
            
       
            }else{
                if(f1.getIntegrante(1).getNombre().equals(nombre)){
                 System.out.println("Integrante solicitado: \nNombre: "+f1.getIntegrante(1).getNombre()+"\nEdad:"+f1.getIntegrante(1).getEdad());
                 System.out.println("Esposo: \nNombre: "+f1.getIntegrante(0).getNombre()+"\nEdad:"+f1.getIntegrante(0).getEdad());
                 for (int i = 2; i < f1.getCantidadIntegrantes(); i++) {
                    System.out.println("Hijo : \nNombre: "+f1.getIntegrante(i).getNombre()+"\nEdad:"+f1.getIntegrante(i).getEdad()+"\nGenero: "+f1.getIntegrante(i).getSexo());
                } 
                }else{
                    for (int i = 2; i < f1.getCantidadIntegrantes(); i++) {
                         if(f1.getIntegrante(i).getNombre().equals(nombre)){
                         a=1;     
                 System.out.println("Integrante solicitado: \nNombre: "+f1.getIntegrante(i).getNombre()+"\nEdad:"+f1.getIntegrante(i).getEdad()+"\nGenero: "+f1.getIntegrante(i).getSexo());     
                 System.out.println("Madre: \nNombre: "+f1.getIntegrante(1).getNombre()+"\nEdad:"+f1.getIntegrante(1).getEdad());
                 System.out.println("Padre: \nNombre: "+f1.getIntegrante(0).getNombre()+"\nEdad:"+f1.getIntegrante(0).getEdad());
                 for (int j = 2; j < f1.getCantidadIntegrantes(); j++) {
                     if(j!=i){
                         
                    System.out.println("Hermano (a): \nNombre: "+f1.getIntegrante(j).getNombre()+"\nEdad:"+f1.getIntegrante(j).getEdad()+"\nGenero: "+f1.getIntegrante(j).getSexo());
                } 
                }}    
                
                }
                    
                  
                
            }}
            if (a==0){
                    System.out.println("Integrante inexistente");
            }}else{
                System.out.println("Familia inexistente");
            }    
                
            break;
        }
        }while (eleccion!=0);
    }
    }

    

