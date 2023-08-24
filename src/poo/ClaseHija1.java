package poo;

public class ClaseHija1 extends ClaseAbstracta{
    private String atributo;

    public ClaseHija1(String atributo, int valor1, String valor2) {
        super(valor1, valor2);
        this.atributo=atributo;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public void MiMetodo(){
        double resultado= Math.pow(valor1,2);
        System.out.println("El resultado es: "+resultado);
    }
}
