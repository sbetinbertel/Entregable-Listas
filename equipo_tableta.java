public class equipo_tableta extends equipo{
    private String almacenamiento;
    private double peso;

    //getters and setters
    public String getAlmacenamiento() {
        return almacenamiento;
    }
    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Constructor con datos heredados de la clase padre equipo
    public equipo_tableta(String serial, String marca, double tamaño, double precio, String almacenamiento,
            double peso) {
        super(serial, marca, tamaño, precio);
        this.almacenamiento = almacenamiento;
        this.peso = peso;
    }
    
    public equipo_tableta() {
    }

    
}
