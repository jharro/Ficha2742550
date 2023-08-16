package modelo;
public class Metodos {

    public String nombre="Alison";
    public double calcularNuevoSalario(double sueldo, double aumento){

        double nuevoSalario=sueldo+(sueldo*(aumento/100));
        return nuevoSalario;
    }

    public void imprimirNuevoSalario(double nuevoSalario){

        System.out.println("el nuevo salario de"+nombre+" es"+nuevoSalario);

    }


}
