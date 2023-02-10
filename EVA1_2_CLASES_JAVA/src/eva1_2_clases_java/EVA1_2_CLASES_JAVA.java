/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_clases_java;

/**
 * @author isaaczapatto
 */
public class EVA1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        *CREAR UN OBJETO
        *INSTANCIACIÓN -> DAR MEMORIA RAM
        *NOMBRE DE LA CLASE IDENTIFICADOR = new CONSTRUCTOR DE LA CLASE
        */
        
        
        Persona perso1 = new Persona(); //Persona() es el constructor
        //System.out.println(perso1);
        /*  
        perso1.nombre = "Jefferson";
        perso1.apellidos = "Gutierritos";
        System.out.println(perso1.nombre + " " + perso1.apellidos);
        */   
        
        
        perso1.setNombre("Jefferson");
        //System.out.println(perso1.getNombre());
        
        perso1.setApellidos("Gutierritos Yakitori");
        //System.out.println(perso1.getApellidos());
        
        perso1.setEdad(84);
        //System.out.println(perso1.getEdad());
        
        perso1.setGénero('P'); //pansexual si por que no me muestren un pan pq sino..
        //System.out.println(perso1.getGénero());
        
        
        //Segunda opción para imprimir todo, en lugar de poner Println para cada set
        //Para ello, se tienen que borrar sólo loas líneas de println, no las de set
        perso1.imprimirDatos();
        
        //----------         Constructor
        Persona perso2 = new Persona();
        
        perso2.setNombre("Shaq'el");
        perso2.setApellidos("Obama");
        perso2.setEdad(2);
        perso2.setGénero('L');
        
        perso2.imprimirDatos();
      
        
    }
}
