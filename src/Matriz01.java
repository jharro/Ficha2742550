public class Matriz01 {
    public static void main(String[] args) {
        String marcas[][]={
                {"Adidas","Puma","Bershka","Oakley"},
                {"Versace","Nike","Arturo","Polo"},
                {"Boss","Vélez","Polito","Moft"},
                {"Gucci","Calvin","Hueco","Sena"},
                {"Gato","China","Calle","Totto"}
        };
        System.out.println("Marcas que tenemos en neustro centro comercial");
        for (int i = 0; i < marcas.length; i++) {
            System.out.println("Marcas en el piso "+(i+1));
            for (int j = 0; j < marcas[i].length; j++) {
                System.out.print(marcas[i][j]+"\t");

            }
            System.out.println("\n");
        }
    }
}
