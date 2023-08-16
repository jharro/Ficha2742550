import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        ArrayList<Integer> lista=new ArrayList<>();
        lista.add(100);
        lista.add(4000);
        System.out.println(lista);
        lista.add(1,700);
        System.out.println(lista);
        System.out.println("Tamaño: "+lista.size());
        lista.add(3,50000);
        System.out.println(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        lista.set(2,800);
        System.out.println("---------");
        System.out.println(lista);
        lista.remove(0);
        System.out.println("---------");
        System.out.println(lista);
        System.out.println(lista.isEmpty());
        System.out.println(lista.contains(800));

        lista.clear();
        System.out.println(lista);
        lista.add(2000000);
        System.out.println(lista);
    }
}
