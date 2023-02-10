/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_2_clases_java;

/**
 *
 * @author isaaczapatto
 */
public class Persona {
    //Datos --> Atributos (miembros) de la clase
    private String nombre;
    private String apellidos;
    private int edad;
    private char género;
    //Métodos --> COMPORTAMIENTO DE LA CLASE
    //LEER Y ESCRIBIR LOS ATRIBUTOS DE LA CLASE
    //LEER --> GET
    //ESCRIBIR --> SET
    //modificador de acceso valor de retorno nombre del método (argumentos) {imlpementación}
    
    
    //Método get
    public String getNombre(){     
    return nombre;
    }
    public String getApellidos(){     
    return apellidos;
    }
    public int getEdad(){     
    return edad;
    }
    public char getGénero(){     
    return género;
    }
    

    //Método set
    public void setNombre(String valor){
     nombre = valor;
    }

    public void setApellidos(String valor){
     apellidos = valor;
    }
    
    public void setEdad(int valor){
     edad = valor;
    }
    
    public void setGénero(char valor){
    género = valor;
    }
    
    
    //Imprimir todos los datos using void 
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Edad: " + edad);
        //System.out.println("Género: " + género); (utilizar una condicional, para imprmir una palabra)
        if(género== 'H'){
            System.out.println("Hombre");
        }else if(género == 'M'){
            System.out.println("Mujer");
        }else if(género == 'B'){
            System.out.println("Bisexual");
        }else if(género == 'P'){
            System.out.println("Prieto");
        }else if(género == 'L'){
            System.out.println("Lesbiano");
        }else if(género == 'A'){
            System.out.println("Asexual");
        }else{
            System.out.println("No ubico tu género bro");
        }
    }
    
}

