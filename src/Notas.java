import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadNotas;
        double nota;
        int contadorAprobados=0;
        int contadorNoAprobados=0;
        double sumaNotas=0;
        System.out.println("Ingrese la cantidad de notas: ");
        cantidadNotas=sc.nextInt();

        for (int i = 1; i <=cantidadNotas ; i++) {
            System.out.print("Ingrese la nota # "+i+" : ");
            nota=sc.nextDouble();
            sumaNotas+=nota;
            if (nota>=3.5){
                contadorAprobados++;
            }else{
                contadorNoAprobados++;
            }
        }
        System.out.println("Cantidad de aprobados: "+contadorAprobados);
        System.out.println("Cantidad no aprobados: "+contadorNoAprobados);
        System.out.println("Promedio de notas "+(sumaNotas/cantidadNotas));
    }
}
