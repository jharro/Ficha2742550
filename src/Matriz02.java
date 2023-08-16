import javax.swing.*;

public class Matriz02 {
    public static void main(String[] args) {
        int filas= Integer.parseInt(JOptionPane.showInputDialog("# de filas"));
        int columnas= Integer.parseInt(JOptionPane.showInputDialog("# de columnas"));

// 1 y 100   10 y 200
        double valores[][]= new double[filas][columnas];
        //bucle for para llenar la matriz
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                valores[i][j]= (int) (Math.random()*(100+1-10))+10;
            }
        }
        System.out.println("Valores generados en la matriz");
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                System.out.print(valores[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
