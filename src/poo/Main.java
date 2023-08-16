package poo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cerdo> listaCerdos=new ArrayList<>();

        Cerdo cerdo1=new Cerdo();

        cerdo1.setNombre("Cerdo Araña");
        cerdo1.setColor("Café");
        cerdo1.setTamanio(1.6f);
        cerdo1.setSexo("Macho");
        cerdo1.setEdad(2);
        listaCerdos.add(cerdo1);

        Cerdo cerdo2=new Cerdo();

        cerdo2.setNombre("Peppo");
        cerdo2.setColor("Rosa");
        cerdo2.setTamanio(1.2f);
        cerdo2.setSexo("Macho");
        cerdo2.setEdad(1);
        listaCerdos.add(cerdo2);

        for (Cerdo c:listaCerdos) {
            System.out.println(c.getNombre()+" "+c.getTamanio());
        }


        System.out.println("El cerdo se llama: "+cerdo1.getNombre());

    }
}
