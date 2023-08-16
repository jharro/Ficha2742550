package poo;

public class Abeja {
    private String color;
    private String tamanio;
    private String tipo_abeja;

    public Abeja(String color, String tamanio, String tipo_abeja) {
        this.color = color;
        this.tamanio = tamanio;
        this.tipo_abeja = tipo_abeja;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getTipo_abeja() {
        return tipo_abeja;
    }

    public void setTipo_abeja(String tipo_abeja) {
        this.tipo_abeja = tipo_abeja;
    }

    @Override
    public String toString() {
        return "Abeja{" +
                "color='" + color + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", tipo_abeja='" + tipo_abeja + '\'' +
                '}';
    }

    public void hacerSonido(){
        System.out.println("El sonido de la abeja...bzz...");
    }
    public void polinizar(){
        System.out.println("Abeja polinizando....");
    }
}
