package poo;

public class Cerdo {
    //Atributos
    private String nombre;
    private String color;
    private float tamanio;
    private String sexo;
    private int edad;

    //Métodos
    //1. Constructor---> vacío, con parámetros
    //Dar valores iniciales a los atributos de la clase
    public Cerdo(String nombre,String color, float tamanio,String sexo, int edad){
        this.nombre=nombre;
        this.color=color;
        this.tamanio=tamanio;
        this.sexo=sexo;
        this.edad=edad;
      //  System.out.println("Se ha creado un objeto");
    }
    //Constructor vacío
    Cerdo(){}

    //2. Set y Get

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {//MACHO-HEMBRA----> ASCENSOR
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //3. toString

    @Override
    public String toString() {
        return "Datos del objeto\n"+"Nombre:" + nombre + "\n" +"Color:" + color + "\nTamaño:"
                + tamanio +"\nSexo:" + sexo + "\nEdad:" + edad;
    }


    //4. Otros métodos
    public void hacerSonido(){
        System.out.println("El sonido del cerdo...oing..oing...");
    }
}
