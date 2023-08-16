package poo;

public class Estudiante extends Persona{
    private String correo;
    private String ficha;

    public Estudiante(String nombre,int id,String correo, String ficha){
        super(nombre,id);
        this.correo=correo;
        this.ficha=ficha;
    }

    @Override
    public String toString() {
        return "Datos del estudiante\n" +
                super.toString()+"Correo: "+this.correo+"\nFicha: "+this.ficha;
    }
}
