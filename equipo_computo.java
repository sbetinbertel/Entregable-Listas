public class equipo_computo extends equipo {
    
    private String sistema_operativo;
    private String procesador;

    //getters and setters
    public String getSistema_operativo() {
        return sistema_operativo;
    }
    public void setSistema_operativo(String sistema_operativo) {
        this.sistema_operativo = sistema_operativo;
    }
    public String getProcesador() {
        return procesador;
    }
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    
    //Constructor con datos heredados de la clase padre equipo
    public equipo_computo(String serial, String marca, double tamaño, double precio, String sistema_operativo,
            String procesador) {
        super(serial, marca, tamaño, precio);
        this.sistema_operativo = sistema_operativo;
        this.procesador = procesador;
    }
    
    public equipo_computo() {
    }
    
    
    
}
