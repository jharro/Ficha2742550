import javax.swing.*;
import java.time.LocalDate;

public class AutoLavado {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);
        int anioActual=fecha.getYear();
        System.out.println("Año actual: "+anioActual);
        //Parseo - Parsing

        //Clases Wrapp ---
        // int Integer
        // double Double
        int modelo=Integer.parseInt(JOptionPane.showInputDialog("Modelo del auto"));
        int antiguedad=anioActual-modelo;
        System.out.println("Antiguedad: "+antiguedad);
        //modelo---> 2001  2010  2021  1989   1990
        //antiguedad = AñoActual - modelo
        String menuAutos="MENÚ VEHÍCULOS\n";
        menuAutos+="1. Automóvil\n";
        menuAutos+="2. Campero\n";
        menuAutos+="3. Camioneta\n";
        menuAutos+="Selecciones una opción entre 1 y 3\n";
        int opcion;
        String menuAutomovil="MENÚ AUTOMÓVIL\n";
        menuAutomovil+="1. Pequeño\n";
        menuAutomovil+="2. Mediano\n";
        menuAutomovil+="3. De lujo\n";

        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog(menuAutos));
        } while(opcion<1 || opcion>3);//5

        switch (opcion){
            case 1:
                do {
                opcion=Integer.parseInt(JOptionPane.showInputDialog(menuAutomovil));
                } while(opcion<1 || opcion>3);
                    switch (opcion){
                        case 1:
                            System.out.println("Lavado cuesta $4000");
                            // 10
                            // 4000*0.20 = 800 ---> 4000 + 800 = 4800
                            // costoTotal=(costoLavado * 0.2) + costoLavado
                            // 4000 * 1.2
                            break;
                        case 2:
                            System.out.println("Lavado cuesta $5000");
                            break;
                        case 3:
                        System.out.println("Lavado cuesta $6000");
                        break;
                    }
                break;
            case 2:
                break;
            case 3:
                break;
        }


    }
}
