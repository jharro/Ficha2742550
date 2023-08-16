public class Funciones {

    public static void main(String[] args) {
        funcionUno();
        funcionUno(5,12);
        double r=funcionUno(5.3,312);
        System.out.println("Resultado: "+r);
        System.out.println(funcionDos());
    }
    public static void funcionUno(){
        System.out.println("Suma: "+(1+1));
    }
    public static void funcionUno(int v1,int v2){
        System.out.println("Suma: "+(v1+v2));
    }
    public static double funcionUno(double v1,int v2){
        return v1+v2;
    }
    public static String funcionDos(){
        return "Hola desde la función";
    }
}

