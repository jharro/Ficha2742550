public class BucleWhile {
    public static void main(String[] args) {
        int i=1;
        System.out.println("Con while");
        while (i<=50){
            System.out.println("i vale: "+i);
            i++;
            if(i==10){
                continue;
            }

            for (int k = 1; k <= 50; k++) {   //inicio del for
                if (k % 3 == 0 && k % 5 == 0) {
                    continue; //siguiente iteracicón del for
                }
                System.out.println(k);
            }  //fin
        }
        System.out.println("Con for");
        for (int j = 1; j <=5 ; j++) {
            System.out.println("Hola");
        }

        System.out.println("Con do while");
        int contador=0;
        do {
            System.out.println("Hola...");
            contador++;
        }while(contador<5);
    }
}
