public class estudiante_ing extends estudiante {
    private int num_semestre;
    private double promedio_acumulado;
    
    public int getNum_semestre() {
        return num_semestre;
    }
    public void setNum_semestre(int num_semestre) {
        this.num_semestre = num_semestre;
    }
    public double getPromedio_acumulado() {
        return promedio_acumulado;
    }
    public void setPromedio_acumulado(double promedio_acumulado) {
        this.promedio_acumulado = promedio_acumulado;
    }

    
    public estudiante_ing(String cedula, String nombre, String serial, String apellido, String telefono, int num_semestre,
            double promedio_acumulado) {
        super(cedula, nombre, serial, apellido, telefono);
        this.num_semestre = num_semestre;
        this.promedio_acumulado = promedio_acumulado;
    }
    
    public estudiante_ing() {
    }
    
    
    
}
