

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EjercicioAL {
    public static void main(String[] args) {
        ArrayList<Integer> enteros=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        int temp;
        System.out.println("Ingrese 5 valores enteros");
        for (int i = 1; i <=5 ; i++) {
            temp=input.nextInt();
            if(!enteros.contains(temp))
                enteros.add(temp);
        }
        Collections.sort(enteros);
        System.out.println(enteros);
    }
}
