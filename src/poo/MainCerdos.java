package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCerdos {
    public static void main(String[] args) {
        ArrayList<Cerdo> cerdos = new ArrayList<>();
        Cerdo cerdo1=new Cerdo("Cerdo 1","Azul",1.2F,"Hembra",35);
        Cerdo cerdo2=new Cerdo("Cerdo 2","Rosa",1.2F,"Macho",3);
        Cerdo cerdo3=new Cerdo("Cerdo 3","Verde",1.2F,"Hembra",5);
        cerdos.add(cerdo1);cerdos.add(cerdo2);cerdos.add(cerdo3);

        System.out.println("Objetos\n");
        for (Cerdo c:cerdos) {
            System.out.println(c.toString());
        }
        Cerdo cerdito=new Cerdo();
        cerdito.setNombre("Cerdo araña");
        cerdito.setColor("Negro");
        cerdito.setSexo("Hembra");
        cerdito.setTamanio(1.8f);
        cerdito.setEdad(32);
        System.out.println("Nuevo cerdito\n");
        System.out.println(cerdito.getNombre());

        Scanner leer= new Scanner(System.in);
        System.out.println("Nombre del cerdo:");
        cerdito.setNombre(leer.next());


        System.out.println("Sexo del cerdo:");
        cerdito.setSexo(leer.next());

        System.out.println("Tamaño del cerdo:");
        cerdito.setTamanio(leer.nextFloat());

        System.out.println("Edad del cerdo:");
        cerdito.setEdad(leer.nextInt());

        cerdos.add(cerdito);
        System.out.println("Nuevo cerdito");
        for (Cerdo c:cerdos) {
            System.out.println(c.toString());
        }

    }
}
