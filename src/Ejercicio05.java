import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double VALOR_PI=Math.PI;
       double area,perimetro,radio;

        System.out.println("CALCULAR ÁREA Y PERÍMETRO DE UN CÍRCULO");
        System.out.print("Radio: ");
        radio=sc.nextDouble();
        //Cálculos
        area=VALOR_PI*Math.pow(radio,2);
        perimetro=2*VALOR_PI*radio;

        //Datos de salida
        System.out.println("El área del círculo: "+area);
        System.out.println("Perímetro: "+perimetro);

    }
}
