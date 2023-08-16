public class Condicionales {
    public static void main(String[] args) {
        //if
        String usuario = "ADSO";
        String nombre = "Juan";
        char letra = 'B';

        int valor1=100,valor2=20;
        //Quiero verificar si valor1 es mayor a valor2. Si es verdadero, que se imprima "Mayor",
       // de lo contrario, "Menor".
        String resultado = (valor1>valor2)?"Mayor":"Menor";
        System.out.println(resultado);

        /*
         * numperico o char lo hacemos con ==
         * int a=10
         * int b=5
         * if (a==b)
         * */
        /*
        if (letra == 'A') System.out.println("Igual a A");
        else if (letra == 'B') System.out.println("Igual a B");
        else if (letra == 'C') System.out.println("Igual a C");
        else System.out.println("Ninguna");
        System.out.println("Condicional con el switch");
        int valor=3;
        switch (valor){
            case 1,2,3,4,5: //if (valor<=5)
                System.out.println("Los valores fueron del 1 al 5");
                break;

            case 'C':
                System.out.println("Ahora es una C");
                break;
            default:
                System.out.println("Ninguna de las anteriores");

        }*/
    }
}
