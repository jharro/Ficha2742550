public class Salarios {
    public static void main(String[] args) {
        int salarios[]={2,1000,4000,40,800,90,10};
        int mayor=salarios[0];
        int menor=salarios[0];

        for (int i = 0; i < salarios.length ; i++) {
            if(salarios[i]>mayor){
                mayor=salarios[i];
            }
            if(salarios[i]<menor){
                menor=salarios[i];
            }
        }
        System.out.println("Mayor: "+mayor);
        System.out.println("Menor: "+menor);
    }
}
