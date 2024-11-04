public class estudiante_dis extends estudiante {
    private String Mod_estudio;
    private int cant_materias;
    public String getMod_estudio() {
        return Mod_estudio;
    }
    public void setMod_estudio(String mod_estudio) {
        Mod_estudio = mod_estudio;
    }
    public int getCant_materias() {
        return cant_materias;
    }
    public void setCant_materias(int cant_materias) {
        this.cant_materias = cant_materias;
    }
    
    public estudiante_dis(String cedula, String nombre, String serial, String apellido, String telefono,
            String mod_estudio, int cant_materias) {
        super(cedula, nombre, serial, apellido, telefono);
        Mod_estudio = mod_estudio;
        this.cant_materias = cant_materias;
    }
    
    public estudiante_dis() {
    }

    
}
