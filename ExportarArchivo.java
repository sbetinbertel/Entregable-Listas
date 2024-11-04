import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ExportarArchivo {

    public void exportarArchivo_ing(LinkedList<estudiante_ing> estudiantes)  {
    
            try (FileWriter escriba = new FileWriter("EstudiantesIngenieria.txt")) {
                for (estudiante_ing item : estudiantes) {
                    escriba.write("Nombre: " + item.getNombre() + "\n");
                    escriba.write("Apellido: " + item.getApellido() + "\n");
                    escriba.write("Cedula: " + item.getCedula() + "\n");
                    escriba.write("Telefono: " + item.getTelefono() + "\n");
                    escriba.write("Semestre Actual: " + item.getNum_semestre() + "\n");
                    escriba.write("Promedio: "+ item.getPromedio_acumulado() + " \n");
                    escriba.write("Serial: " + item.getSerial() + "\n");
                    escriba.write("---------------------------------------\n");
                }
                System.out.println("Archivo exportado correctamente");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exportarArchivo_computador(LinkedList<equipo_computo> computador)  {
    
            try (FileWriter escriba = new FileWriter("Computadores.txt")) {

                for (equipo_computo item : computador) {
                    escriba.write("Marca: " + item.getMarca() + "\n");
                    escriba.write("Serial: " + item.getSerial() + "\n");
                    escriba.write("Tamaño: " + item.getTamaño() + "\n");
                    escriba.write("Precio: " + item.getPrecio() + "\n");
                    escriba.write("Procesador: " + item.getProcesador()+ "\n");
                    escriba.write("Sistema Operativo: " + item.getSistema_operativo() + "\n");
                    escriba.write("---------------------------------------\n");
                }
                System.out.println("Archivo exportado correctamente");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    public void exportarArchivo_Dis(LinkedList<estudiante_dis> estudiante){
        try (FileWriter escriba = new FileWriter("EstudiantesDiseño.txt")) {
            for (estudiante_dis item : estudiante) {
                escriba.write("Nombre: " + item.getNombre() + "\n");
                escriba.write("Apellido: " + item.getApellido() + "\n");
                escriba.write("Cedula: " + item.getCedula() + "\n");
                escriba.write("Modalidad de Estudio: " + item.getMod_estudio() + "\n");
                escriba.write("Serial: " + item.getSerial() + "\n");
                escriba.write("Telefono: " + item.getTelefono() + "\n");
                escriba.write("Cantidad de Materias: " + item.getCant_materias() + "\n");
                escriba.write("---------------------------------------\n");
            }
            System.out.println("Archivo exportado correctamente");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exportarArchivo_tableta(LinkedList<equipo_tableta> tableta){
        try (FileWriter escriba = new FileWriter("Tabletas.txt")) {

            for (equipo_tableta item : tableta) {
                escriba.write("Marca: " + item.getMarca() + "\n");
                escriba.write("Serial: " + item.getSerial() + "\n");
                escriba.write("Tamaño: " + item.getTamaño() + "\n");
                escriba.write("Precio: " + item.getPrecio() + "\n");
                escriba.write("Almacenamiento: " + item.getAlmacenamiento()+ "\n");
                escriba.write("Peso: " + item.getPeso() + "\n");
                escriba.write("---------------------------------------\n");
            }
            System.out.println("Archivo exportado correctamente");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
