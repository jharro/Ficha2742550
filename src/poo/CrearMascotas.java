package poo;

public class CrearMascotas {
    public static void main(String[] args) {
        Cat felix = new Cat();
        felix.setNombre("Felix");
        System.out.println("Hola, soy el gato "+felix.getNombre());
        System.out.println(felix.hablar());

        Dog amanda = new Dog();
        amanda.setNombre("Amanda");
        System.out.println("Holi...soy la preciosa..."+amanda.getNombre());
        System.out.println(amanda.fetch());
    }
}
