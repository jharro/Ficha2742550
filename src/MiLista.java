import java.util.ArrayList;

public class MiLista {
    public static void main(String[] args) {
        ArrayList<Integer> lista=new ArrayList<>();
        System.out.println("Tamaño de la lista: "+lista.size());
        System.out.println(lista.isEmpty());
        lista.add(4000);
        lista.add(899);
        lista.add(2000);
        lista.add(18);
        System.out.println(lista);
        System.out.println("-----------");
        System.out.println("Tamaño de la lista: "+lista.size());
        System.out.println(lista.isEmpty());
        System.out.println(lista.get(1));
        lista.set(0,100000);
        lista.remove(2);

        System.out.println("Usando bucle for");
        if (lista.isEmpty()){
            System.out.println("La lista está vacía");
        }else{
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
            }
        }
        System.out.println("Nuevo tamaño: "+lista.size());

        //Para verificar si el valor 100000 está en la lista
        if(lista.contains(10000)){
            System.out.println("El valor buscado está en la lista");
        }else{
            System.out.println("El lobo no está");
        }
    int valor=9000;
        lista.add(1,valor);
        System.out.println("Lista actualizada");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("Usando for each");
        for (Integer iterar: lista) {
            System.out.println(iterar);
        }
    }
}
