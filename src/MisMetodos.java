public class MisMetodos {

    //Mis métodos
    //1. No retorna nada - no recibe parámetros
    public static void metodoUno(){
        System.out.println("Joel no se ha bañado.... :)");
    }
    //2. No retorna - recibe parámetros
    public static void metodoUno(String nombre){
        System.out.println(nombre + " no se ha bañado.... :)");
    }
    //3. Retorna - recibe parámetros
    public static String metodoUno(int edad){
        return "Yo tengo "+edad+" años";
    }
    //3. Retorna - no recibe parámetros
    public static double metodo(){
        double valor=3.6;
        return Math.pow(valor,2);
    }
    //Mpetodo que recibe un arreglo y lo imprime
    public static void imprimirVector(int vector[]){
        System.out.println("Valores en el arreglo");
        for (int i = 0; i < vector.length; i++) {

            System.out.print(vector[i]+" ");

        }
    }

    public static void main(String[] args) {
            metodoUno();
            metodoUno();
            metodoUno("Isaías");
            String  mensajito=metodoUno(65);
        System.out.println(mensajito);
        System.out.println("Resultado del método: "+metodo());

        int valores[]={56,90,636,3,-33,0};
        imprimirVector(valores);
        int valores_2[]={456,590,66636,773,-33,0,33,3,5,6,7,7};
        imprimirVector(valores_2);
    }

}
