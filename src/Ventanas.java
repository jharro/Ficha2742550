import javax.swing.*;

public class Ventanas {
    public static void main(String[] args) {
        String menu="MEN+U\n";
        menu+="1.Opción\n";
        menu+="2. Opción\n";
        String menuVehiculos="MENÚ VEHÍCULOS\n";
        menuVehiculos+="1.Tipo uno\n";
        menuVehiculos+="2. Tipo 2\n";
        menuVehiculos+="3. Tipo 3\n";
        menuVehiculos+="4. Tipo 4\n";
        int opcion;
      //  int valor=Integer.parseInt(JOptionPane.showInputDialog("Valor"));

        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
        }while (opcion<1 || opcion>5);
        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog(menuVehiculos));
        }while (opcion<1 || opcion>5);

    }
}
