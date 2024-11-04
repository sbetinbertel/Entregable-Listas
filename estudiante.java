public class estudiante {
    private String cedula;
    private String nombre;
    private String serial;
    private String apellido;
    private String telefono;
    
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public estudiante(String cedula, String nombre, String serial, String apellido, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.serial = serial;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    
    public estudiante() {
    } 
    
    
}
