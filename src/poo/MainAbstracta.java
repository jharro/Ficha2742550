package poo;

public class MainAbstracta {
    public static void main(String[] args) {
        ClaseHija1 claseHija1=new ClaseHija1("Juan",12,"Valor");
        claseHija1.MiMetodo();
        claseHija1.setAtributo("Juana");
        System.out.println(claseHija1.getAtributo());
    }
}