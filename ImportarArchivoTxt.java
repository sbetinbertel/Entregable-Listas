import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class ImportarArchivoTxt {
    public LinkedList<estudiante_ing> importarArchivoIngnieria(){
        String rutaArchivo = "EstudiantesIngenieria.txt";

        File archivo = new File(rutaArchivo);
        if (!archivo.exists()) {
            return null;
        }

        LinkedList<estudiante_ing> listaDePersonas = new LinkedList<>();

        estudiante_ing estudiante =new estudiante_ing();

        String line;
        
        try (BufferedReader cp = new BufferedReader(new FileReader(rutaArchivo))){
            while ((line = cp.readLine()) != null){

                if (line.startsWith("Nombre: ")){
                    estudiante.setNombre(line.substring(8 ));
                    continue;
                }
                if (line.startsWith("Apellido: ")){
                    estudiante.setApellido(line.substring(10));
                    continue;
                }
                if (line.startsWith("Cedula: ")){
                    estudiante.setCedula(line.substring(8));
                    continue;
                }
                if (line.startsWith("Telefono: ")){
                    estudiante.setTelefono(line.substring(10));
                    continue;
                }
                if (line.startsWith("Semestre Actual: ")){
                    estudiante.setNum_semestre(Integer.parseInt(line.substring(17)));
                    continue;
                }
                if (line.startsWith("Promedio: ")){
                    estudiante.setPromedio_acumulado(Double.parseDouble(line.substring(10)));
                    continue;
                }
                if (line.startsWith("Serial: ")){
                    estudiante.setSerial(line.substring(8));
                    continue;
                }

                listaDePersonas.add(estudiante);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
        return listaDePersonas;
    }

    public LinkedList<equipo_computo> importarArchivoComputadores(){
        String rutaArchivo = "Computadores.txt";

        File archivo = new File(rutaArchivo);
        if (!archivo.exists()) {
            return null;
        }

        LinkedList<equipo_computo> listaComputo = new LinkedList<>();

        equipo_computo computador =new equipo_computo();

        String line;
        
        try (BufferedReader cp = new BufferedReader(new FileReader(rutaArchivo))){
            while ((line = cp.readLine()) != null){

                if (line.startsWith("Marca: ")){
                    computador.setMarca(line.substring(7));
                    continue;
                }
                if (line.startsWith("Serial: ")){
                    computador.setSerial(line.substring(8));
                    continue;
                }
                if (line.startsWith("Tamaño: ")){
                    computador.setTamaño(Double.parseDouble(line.substring(8)));
                    continue;
                }
                if (line.startsWith("Precio: ")){
                    computador.setPrecio(Double.parseDouble(line.substring(8)));
                    continue;
                }
                if (line.startsWith("Procesador: ")){
                    computador.setProcesador(line.substring(12));
                    continue;
                }
                if (line.startsWith("Sistema Operativo: ")){
                    computador.setSistema_operativo(line.substring(19));
                    continue;
                }

                listaComputo.add(computador);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
        return listaComputo;
    }

    public LinkedList<estudiante_dis> importarArchivoDiseño(){
        String rutaArchivo = "EstudiantesDiseño.txt";

        File archivo = new File(rutaArchivo);
        if (!archivo.exists()) {
            return null;
        }

        LinkedList<estudiante_dis> listaDiseño = new LinkedList<>();

        estudiante_dis estudiante =new estudiante_dis();

        String line;
        
        try (BufferedReader cp = new BufferedReader(new FileReader(rutaArchivo))){
            while ((line = cp.readLine()) != null){

                if (line.startsWith("Nombre: ")){
                    estudiante.setNombre(line.substring(8 ));
                    continue;
                }
                if (line.startsWith("Apellido: ")){
                    estudiante.setApellido(line.substring(10));
                    continue;
                }
                if (line.startsWith("Cedula: ")){
                    estudiante.setCedula(line.substring(8));
                    continue;
                }
                if (line.startsWith("Modalidad de Estudio: ")){
                    estudiante.setMod_estudio(line.substring(22));
                    continue;
                }
                if (line.startsWith("Serial: ")){
                    estudiante.setSerial(line.substring(8));
                    continue;
                }
                if (line.startsWith("Telefono: ")){
                    estudiante.setTelefono(line.substring(10));
                    continue;
                }
                if (line.startsWith("Cantidad de Materias: ")){
                    estudiante.setCant_materias(Integer.parseInt(line.substring(22)));
                    continue;
                }
                listaDiseño.add(estudiante);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
        return listaDiseño;
    }

    public LinkedList<equipo_tableta> importarArchivoTableta(){
        String rutaArchivo = "Tabletas.txt";

        File archivo = new File(rutaArchivo);
        if (!archivo.exists()) {
            return null;
        }

        LinkedList<equipo_tableta> ListaTableta = new LinkedList<>();

        equipo_tableta estudiante =new equipo_tableta();

        String line;
        
        try (BufferedReader cp = new BufferedReader(new FileReader(rutaArchivo))){
            while ((line = cp.readLine()) != null){

                if (line.startsWith("Marca: ")){
                    estudiante.setMarca(line.substring(7));
                    continue;
                }
                if (line.startsWith("Serial: ")){
                    estudiante.setSerial(line.substring(8));
                    continue;
                }
                if (line.startsWith("Tamaño: ")){
                    estudiante.setTamaño(Double.parseDouble(line.substring(8)));
                    continue;
                }
                if (line.startsWith("Precio: ")){
                    estudiante.setPrecio(Double.parseDouble(line.substring(8)));
                    continue;
                }
                if (line.startsWith("Almacenamiento: ")){
                    estudiante.setAlmacenamiento(line.substring(16));
                    continue;
                }
                if (line.startsWith("Peso: ")){
                    estudiante.setPeso(Double.parseDouble(line.substring(6)));
                    continue;
                }
                ListaTableta.add(estudiante);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return ListaTableta;
    }
}
