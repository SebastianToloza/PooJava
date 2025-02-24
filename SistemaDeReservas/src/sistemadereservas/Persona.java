
package sistemadereservas;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private int id;
    private String correo;
    public Scanner respuesta = new Scanner(System.in);

    public Persona(String nombre,int id, String correo){
        this.nombre=nombre;
        this.id=id;
        this.correo=correo;
    }
    public void pedirNombre(){
        String nombre2 = respuesta.nextLine();
        this.nombre=nombre2;
    }
    public void pedirId(){
        int id2 = respuesta.nextInt();
        this.id=id2;
    }
    public void pedirCorreo(){
        String correo2 = respuesta.nextLine();
        this.correo=correo2;
    }
}
